package com.esme.spring.faircorp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private String area;

    @Column(name = "price")
    private int price;

    @Column(name = "number_of_tenants")
    private int numberOfTenants;

    @Column(name = "rent_from")
    private Date rentFrom;

    @Column(name ="sex")
    private String sex;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Tenants> tenants;

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    private Tus tus;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Service> serviceList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Revenue> revenueList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Bill> billList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Incident> incidentList;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void setNumberOfTenants(int numberOfTenants) {
        this.numberOfTenants = numberOfTenants;
    }

    public Date getRentFrom() {
        return rentFrom;
    }

    public void setRentFrom(Date rentFrom) {
        this.rentFrom = rentFrom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Tenants> getTenants() {
        return tenants;
    }

    public void setTenants(List<Tenants> tenants) {
        this.tenants = tenants;
    }

    public Tus getTus() {
        return tus;
    }

    public void setTus(Tus tus) {
        this.tus = tus;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public List<Revenue> getRevenueList() {
        return revenueList;
    }

    public void setRevenueList(List<Revenue> revenueList) {
        this.revenueList = revenueList;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public List<Incident> getIncidentList() {
        return incidentList;
    }

    public void setIncidentList(List<Incident> incidentList) {
        this.incidentList = incidentList;
    }

    public Room(int id, String name, String area, int price, int numberOfTenants, Date rentFrom, String sex, String image, Users users, List<Tenants> tenants, Tus tus, List<Service> serviceList, List<Revenue> revenueList, List<Bill> billList, List<Incident> incidentList) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.sex = sex;
        this.image = image;
        this.users = users;
        this.tenants = tenants;
        this.tus = tus;
        this.serviceList = serviceList;
        this.revenueList = revenueList;
        this.billList = billList;
        this.incidentList = incidentList;
    }

    public Room() {
    }

    public Room(String name, String area, int price, int numberOfTenants, Date rentFrom, String sex, Users users, List<Tenants> tenants, Tus tus, List<Service> serviceList, List<Revenue> revenueList, List<Bill> billList, List<Incident> incidentList) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.sex = sex;
        this.users = users;
        this.tenants = tenants;
        this.tus = tus;
        this.serviceList = serviceList;
        this.revenueList = revenueList;
        this.billList = billList;
        this.incidentList = incidentList;
    }

    public Room(String name, String area, int price, int numberOfTenants, Date rentFrom, String sex, String image, Users users) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.sex = sex;
        this.image = image;
        this.users = users;
    }
}
