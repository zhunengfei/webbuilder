package org.webbuilder.web.po.config;

import org.webbuilder.web.core.bean.GenericPo;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.Properties;

/**
 * 系统配置
 * Created by generator
 */
public class Config extends GenericPo<String> {

    //主键
    private String u_id;

    //备注
    private String remark;

    //配置内容
    private String content;

    //创建日期
    private java.util.Date create_date;

    //最后一次修改日期
    private java.util.Date update_date;

    /**
     * 获取 主键
     *
     * @return String 主键
     */
    public String getU_id() {
        if (this.u_id == null)
            return "";
        return this.u_id;
    }

    /**
     * 设置 主键
     */
    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    /**
     * 获取 备注
     *
     * @return String 备注
     */
    public String getRemark() {
        if (this.remark == null)
            return "";
        return this.remark;
    }

    /**
     * 设置 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 配置内容
     *
     * @return String 配置内容
     */
    public String getContent() {
        if (this.content == null)
            return "";
        return this.content;
    }

    /**
     * 设置 配置内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 创建日期
     *
     * @return java.util.Date 创建日期
     */
    public java.util.Date getCreate_date() {
        return this.create_date;
    }

    /**
     * 设置 创建日期
     */
    public void setCreate_date(java.util.Date create_date) {
        this.create_date = create_date;
    }

    /**
     * 获取 最后一次修改日期
     *
     * @return java.util.Date 最后一次修改日期
     */
    public java.util.Date getUpdate_date() {
        return this.update_date;
    }

    /**
     * 设置 最后一次修改日期
     */
    public void setUpdate_date(java.util.Date update_date) {
        this.update_date = update_date;
    }

    public Properties toMap() {
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
