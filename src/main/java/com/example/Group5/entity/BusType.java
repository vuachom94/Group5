package com.example.Group5.entity;

import javax.persistence.*;

@Entity
@Table(name = "bus_type")
public class BusType {

    @Id
    @GeneratedValue
    @Column(name = "BUS_TYPE_ID", nullable = false)
    private int busTypeId;

    @Column(name = "TYPE", nullable = false)
    private String busType;

    @Column(name = "TOTAL_SEAT", nullable = false)
    private int totalSeat;

    public int getBusTypeId() {
        return busTypeId;
    }

    public void setBusTypeId(int busTypeId) {
        this.busTypeId = busTypeId;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getTotalSeat() { return totalSeat; }

    public void setTotalSeat(int totalSeat) { this.totalSeat = totalSeat; }
}
