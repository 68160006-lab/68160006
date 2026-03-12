package lab12;

public class Rational {
    int sed;
    int suan;

    public Rational(int a, int b) {
        sed = a;
        suan = b;
    }

    public double getReal() {
        return (double) sed / suan;
    }

    public Rational plus(Rational r) {
        Rational tmpR;
        int tmpSed, tmpSuan;
        if (suan == r.suan) {
            tmpSed = sed + r.sed;
            tmpR = new Rational(tmpSed, suan);
        } else {
            tmpSed = (sed * r.suan) + (r.sed * suan);
            tmpSuan = suan * r.suan;
            tmpR = new Rational(tmpSed, tmpSuan);
        }
        return tmpR;
    }

    public String show() {
        return sed + "/" + suan;
    }

    public Rational sub(Rational r) {
        Rational tmpR;
        int tmpSed, tmpSuan;
        if (suan == r.suan) {
            tmpSed = sed - r.sed;
            tmpR = new Rational(tmpSed, suan);
        } else {
            tmpSed = (sed * r.suan) - (r.sed * suan);
            tmpSuan = suan * r.suan;
            tmpR = new Rational(tmpSed, tmpSuan);
        }
        return tmpR;
    }
}
