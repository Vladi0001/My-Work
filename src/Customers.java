import java.util.Scanner;
public class Customers {
    private String nameProjekt;
    private String nameCostomers;
    private String nikAndKontakt;
    private String service;
    private int summ;
    private int paymentDate;



    public Customers (String nameProjekt, String nameCostomers, String nikAndKontakt, String service, int summ, int paymentDate){
        this.nameProjekt = nameProjekt;
        this.nameCostomers = nameCostomers;
        this.nikAndKontakt = nikAndKontakt;
        this.service = service;
        this.summ = summ;
        this.paymentDate = paymentDate;
    }

    public String getNameProjekt() {
        return nameProjekt;
    }

    public String getNameCostomers() {
        return nameCostomers;
    }

    public String getNikAndKontakt() {
        return nikAndKontakt;
    }

    public String getService() {
        return service;
    }

    public int getSumm() {
        return summ;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setNameProjekt(String nameProjekt) {
        this.nameProjekt = nameProjekt;
    }

    public void setNameCostomers(String nameCostomers) {
        this.nameCostomers = nameCostomers;
    }

    public void setNikAndKontakt(String nikAndKontakt) {
        this.nikAndKontakt = nikAndKontakt;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Проект - " +
                 nameProjekt + ". " +
                "ФИО клиента - " + nameCostomers + ". " +
                "Ник или контакт клиента - " + nikAndKontakt + ". " +
                "Услуга - " + service + ". " +
                "Сумма оплаты от клиента - " + summ + " рублей. " +
                "Дата оплаты от клиента - " + paymentDate + " число."
                ;
    }

}
