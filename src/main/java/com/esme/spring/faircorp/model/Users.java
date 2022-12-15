package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenum")
    private String phoneNum;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "CCCD")
    private String CCCD;

    @Column(name = "type")
    private boolean type;

    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Notification> notifyList;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<Notification> notifications;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Room> roomList;


    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Revenue> revenueList;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    private List<Revenue> revenues;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Tenants> tenantsList;

    @ManyToMany(mappedBy = "usersSave", cascade = CascadeType.ALL)
    private List<Tus> tusSaveList;

    @OneToOne(mappedBy = "usersParent", cascade = CascadeType.ALL)
    private Tenants tenants;

    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
    private Info info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Notification> getNotifyList() {
        return notifyList;
    }

    public void setNotifyList(List<Notification> notifyList) {
        this.notifyList = notifyList;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Revenue> getRevenueList() {
        return revenueList;
    }

    public void setRevenueList(List<Revenue> revenueList) {
        this.revenueList = revenueList;
    }

    public List<Revenue> getRevenues() {
        return revenues;
    }

    public void setRevenues(List<Revenue> revenues) {
        this.revenues = revenues;
    }

    public List<Tenants> getTenantsList() {
        return tenantsList;
    }

    public void setTenantsList(List<Tenants> tenantsList) {
        this.tenantsList = tenantsList;
    }

    public List<Tus> getTusSaveList() {
        return tusSaveList;
    }

    public void setTusSaveList(List<Tus> tusSaveList) {
        this.tusSaveList = tusSaveList;
    }

    public Tenants getTenants() {
        return tenants;
    }

    public void setTenants(Tenants tenants) {
        this.tenants = tenants;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Users() {
    }

    public Users(String userName, String password, String name, String email, String phoneNum, boolean type) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.type = type;
    }

    public Users(String userName, String password, String name, String email, String phoneNum, Date birthday, String CCCD, boolean type, String image, List<Notification> notifyList, List<Notification> notifications, List<Room> roomList, List<Revenue> revenueList, List<Revenue> revenues, List<Tenants> tenantsList, List<Tus> tusSaveList, Tenants tenants, Info info, List<Service> serviceList) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.CCCD = CCCD;
        this.type = type;
        this.image = image;
        this.notifyList = notifyList;
        this.notifications = notifications;
        this.roomList = roomList;
        this.revenueList = revenueList;
        this.revenues = revenues;
        this.tenantsList = tenantsList;
        this.tusSaveList = tusSaveList;
        this.tenants = tenants;
        this.info = info;
    }
}
