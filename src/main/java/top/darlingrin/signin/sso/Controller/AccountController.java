package top.darlingrin.signin.sso.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.darlingrin.signin.sso.Service.CheckUserService;
import top.darlingrin.signin.sso.beans.User;

import java.util.HashMap;
import java.util.Map;


@Controller
@Slf4j
public class AccountController {
    @Autowired
    CheckUserService checkUserService;
    final ObjectMapper objmapper = new ObjectMapper();

    @PostMapping(value = "signin")
    @ResponseBody
    public ResponseEntity<String> checkAccount(@RequestParam("name") String username, @RequestParam("userpwd") String pwd){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        User user = checkUserService.selectOne(wrapper);
        String recodepwd = DigestUtils.md5Hex(pwd);
        Map<String,String> returnmap = new HashMap();
        try {
            if (user != null) {
                if (StringUtils.equals(username, user.getUsername()) && StringUtils.equals(recodepwd, user.getUserpwd())) {
                    return ResponseEntity.status(HttpStatus.OK).body(objmapper.writeValueAsString(returnmap.put("resdata", "yes")));
                }
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String wellcomeFunction(){
        return "RinLogin";

    }
}
