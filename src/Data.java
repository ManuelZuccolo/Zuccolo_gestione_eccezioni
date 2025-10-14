import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data
{
    private int giorno;
    private int mese;
    private int anno;

    //Immagina avere parametri
    public Data()
    {
        this.giorno = 1;
        this.mese = 1;
        this.anno = 2000;
    }

    //Qualcuno li ha
    public Data(int giorno, int mese, int anno) throws DataNonValidaException
    {
        setData(giorno, mese, anno);
    }


    public void setData(int giorno, int mese, int anno) throws DataNonValidaException {
        if (!isDataValida(giorno, mese, anno)) {
            throw new DataNonValidaException("Data non valida: " + giorno + "/" + mese + "/" + anno);
        }
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }


    public String getData() {
        return String.format("%02d/%02d/%04d", giorno, mese, anno);
    }


    public long distanzaInGiorni(Data altraData) {
        LocalDate d1 = LocalDate.of(this.anno, this.mese, this.giorno);
        LocalDate d2 = LocalDate.of(altraData.anno, altraData.mese, altraData.giorno);
        return ChronoUnit.DAYS.between(d1, d2);
    }

    //We good?
    private boolean isDataValida(int g, int m, int a)
    {
        try {
            LocalDate.of(a, m, g);//Lancia la nostra carissima eccezione
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
