package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("par")
public class AumentoParServiceImpl implements AumentoService{

	@Override
	public BigDecimal incremetar(BigDecimal monto) {
		BigDecimal comision = monto.multiply(new BigDecimal(.05));
		return monto.add(comision);
	}

}
