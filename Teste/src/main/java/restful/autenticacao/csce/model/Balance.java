package restful.autenticacao.csce.model;

import javax.persistence.Embeddable;

@Embeddable
public class Balance  {
    private int value;

    private String currency;

    private String displayCurrencyCode;

    private String displayText;


    public Balance(){

    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDisplayCurrencyCode() {
        return displayCurrencyCode;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDisplayCurrencyCode(String displayCurrencyCode) {
        this.displayCurrencyCode = displayCurrencyCode;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }



    public Balance(int value, String currency, String displayCurrencyCode, String displayText){
        this.value = value;
        this.currency = currency;
        this.displayCurrencyCode = displayCurrencyCode;
        this.displayText = displayText;
    }



}
