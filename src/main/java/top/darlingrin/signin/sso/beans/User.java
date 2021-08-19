package top.darlingrin.signin.sso.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("userinfo")
public class User implements Serializable {
    @TableField("uid")
    private String uid;
    @TableField("username")
    private String username;
    @TableField("userpwd")
    private String userpwd;
    @TableField("emial")
    private String Email;
    @TableField("phone")
    private String Phone;
}
