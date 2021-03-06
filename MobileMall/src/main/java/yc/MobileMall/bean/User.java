package yc.MobileMall.bean;

import java.sql.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.first_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.integral
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private Integer integral;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.security_code
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private String securityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.isblacklist
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    private Integer isblacklist;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account
     *
     * @return the value of user.account
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account
     *
     * @param account the value for user.account
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.first_name
     *
     * @return the value of user.first_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.first_name
     *
     * @param firstName the value for user.first_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_name
     *
     * @return the value of user.last_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_name
     *
     * @param lastName the value for user.last_name
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.integral
     *
     * @return the value of user.integral
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.integral
     *
     * @param integral the value for user.integral
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.security_code
     *
     * @return the value of user.security_code
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.security_code
     *
     * @param securityCode the value for user.security_code
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isblacklist
     *
     * @return the value of user.isblacklist
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public Integer getIsblacklist() {
        return isblacklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isblacklist
     *
     * @param isblacklist the value for user.isblacklist
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    public void setIsblacklist(Integer isblacklist) {
        this.isblacklist = isblacklist;
    }
}