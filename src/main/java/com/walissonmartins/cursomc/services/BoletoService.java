package com.walissonmartins.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.walissonmartins.cursomc.domain.PagamentoDeboleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoDeboleto pagto, Date InstanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(InstanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);

		pagto.setDataVencimento(cal.getTime());

	}
}
