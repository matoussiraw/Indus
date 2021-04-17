package indus.app.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity

public class Production {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduction;
    private String client;
    private String article;
    private String melange;
    private Date dateFabrication;
    private String quantite;

    public Production() {
        super();
    }

    public Production(String client,String article,String melange,Date dateFabrication,String quantite) {
        super();
        this.client= client;
        this.article= article;
        this.melange= melange;
        this.dateFabrication= dateFabrication;
        this.quantite= quantite;
    }

    public long getIdProduction() {
        return idProduction;
    }

    public void setIdProduction(long idProduction) {
        this.idProduction = idProduction;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getMelange() {
        return melange;
    }

    public void setMelange(String melange) {
        this.melange = melange;
    }

    public Date getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(Date dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Production{" +
                "idProduction=" + idProduction +
                ", client='" + client + '\'' +
                ", article='" + article + '\'' +
                ", melange='" + melange + '\'' +
                ", dateFabrication=" + dateFabrication +
                ", quantite='" + quantite + '\'' +
                '}';
    }
}
