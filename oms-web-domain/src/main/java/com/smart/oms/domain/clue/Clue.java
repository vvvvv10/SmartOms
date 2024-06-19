package com.smart.crm.domain.clue;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Clue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.id
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.status
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_name
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_tel
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_contacts_name
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyContactsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_contacts_tel
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyContactsTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_contacts_sex
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private Integer companyContactsSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_contacts_email
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyContactsEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_address
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.company_contacts_job_title
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String companyContactsJobTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.create_time
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.update_time
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.assign_time
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private Date assignTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.clue_source
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String clueSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.activity_id
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.user_id
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clue.remark
     *
     * @mbg.generated Sat Jun 15 00:14:26 CST 2024
     */
    private String remark;


}
