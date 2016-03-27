package br.edu.bmfbovespa.service;

import br.edu.loader.entity.Quotation;
import br.edu.loader.repository.QuotationRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by rodrigo on 17/03/16.
 */
public class QuotationsService {

    private QuotationRepository repository = new QuotationRepository();

    public List<Quotation> getQuotations() {
        return repository.findAll();
    }

    public List<Quotation> listByCode(String code) {
        return repository.listByCode(code);
    }

    public List<Quotation> listByDate(String code, Date tradingDate) {
        return repository.listByDate(code, tradingDate);
    }

    public Quotation getMostRecent(String code) throws Exception {
        return  repository.getMostRecent(code);
    }


}
