package com.nhnacademy.edu.springframework.repository;

public interface BillStore {


    public void load(String filePath);

    public void usage(int waterUsage);
}
