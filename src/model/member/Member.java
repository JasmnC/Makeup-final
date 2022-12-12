/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.member;

import javax.swing.ImageIcon;
import model.Enterprise.MemberEnterprise;
import model.UserAccount.UserAccount;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author yuujadz
 */
public class Member {
    
    private MemberEnterprise enterprise;
    private int id;
    private String name;
    private String userName;
    private String area;
    private String sex;
    private String height;
    private int weight;
    private int age;
    private String photo;
    private ImageIcon photoIcon;
    private String inbody;
    private ImageIcon inbodyIcon;
    private String gender;
    private String mobile;
    private String email;
    private String consultantMessage;
    private String trainerMessage;
    
    private WorkQueue workQueue;
    
    public Member(String name) {
        this.name = name;
        this.workQueue = new WorkQueue();
    }

    public MemberEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(MemberEnterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ImageIcon getPhotoIcon() {
        return photoIcon;
    }

    public void setPhotoIcon(ImageIcon photoIcon) {
        this.photoIcon = photoIcon;
    }

    public String getInbody() {
        return inbody;
    }

    public void setInbody(String inbody) {
        this.inbody = inbody;
    }

    public ImageIcon getInbodyIcon() {
        return inbodyIcon;
    }

    public void setInbodyIcon(ImageIcon inbodyIcon) {
        this.inbodyIcon = inbodyIcon;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConsultantMessage() {
        return consultantMessage;
    }

    public void setConsultantMessage(String consultantMessage) {
        this.consultantMessage = consultantMessage;
    }

    public String getTrainerMessage() {
        return trainerMessage;
    }

    public void setTrainerMessage(String trainerMessage) {
        this.trainerMessage = trainerMessage;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
