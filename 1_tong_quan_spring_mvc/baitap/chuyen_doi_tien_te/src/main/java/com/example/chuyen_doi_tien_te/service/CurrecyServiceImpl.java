package com.example.chuyen_doi_tien_te.service;

public class CurrecyServiceImpl implements ICurrencyService{
    @Override
    public double usdToVnd(double usd) {
        return usd*23460;
    }
}
