package com.EmailApp;
import java.awt.*;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double qskv;
        double tsks;
        double npr;
        double nskv;
        double Vskv;
        double qstkond;
        double nkol;
        double Qdeg;
        double vobshukpg;
        double qb;
        double rdb;
        double k;
        double c;
        double qgaz;
        double Qdeg2;
        double vobshukpg1;
        double Udeg;
        double P;
        double T;
        double C;
        double Vreg;
        double A;
        double qdeg1;
        double Qreg;
        double rash71;
        double rash72;
        double Qdeg8;
        double Qkoteldkc;
        double Qkotelukpg;
        double Qfakeldkc;
        double Qfakelukpg;
        double qutechukpg;
        double tukpg;
        double yukpg;
        double nukpg;
        double pgukpg;
        double qutechgp;
        double tgp;
        double ugp;
        double ngp;
        double pggp;
        double qutechdkc;
        double tdkc;
        double udkc;
        double ndkc;
        double pgdkc;
        double rash111;

        double qutechukpg1;
        double tukpg1;
        double yukpg1;
        double nukpg1;
        double pgukpg1;
        double qutechgp1;
        double tgp1;
        double ugp1;
        double ngp1;
        double pggp1;
        double qutechdkc1;
        double tdkc1;
        double udkc1;
        double ndkc1;
        double pgdkc1;
        double rash112;

        double qutechukpg2;
        double tukpg2;
        double yukpg2;
        double nukpg2;
        double pgukpg2;
        double qutechgp2;
        double tgp2;
        double ugp2;
        double ngp2;
        double pggp2;
        double qutechdkc2;
        double tdkc2;
        double udkc2;
        double ndkc2;
        double pgdkc2;
        double rash113;
        double Gvodi;
        double MH2O;
        double Gnestkond;
        double Mnestkond;
        double Qupb;
        double Qupnest;
        double Snipobg;
        double Snipall;
        double Snipsallob;
        double Sniptechnujd;
        double Sniptechnujdob;
        double Snip11;
        double Snip11ob;
        double Snip12;
        double Snip12ob;
        double Snip13;
        double Snip13ob;
        double Snip14;
        double Snip14ob;
        double Snip15;
        double Snip15ob;
        double Snip16;
        double Snip16ob;
        double Sniptopnujd;
        double Sniptopnujdob;
        double Snip21;
        double Snip21ob;
        double Snip22;
        double Snip22ob;
        double Snip23;
        double Snip23ob;
        double Snip24;
        double Snip24ob;
        double Snip25;
        double Snip25ob;
        double Snip26;
        double Snip26ob;
        double Snip27;
        double Snip27ob;
        double Snipoter;
        double Snipoterob;
        double Snip31;
        double Snip31ob;
        double Snip32;
        double Snip32ob;
        double Snip33;
        double Snip33ob;
        double Sniposed;
        double Sniposedob;
        double Snip41;
        double Snip41ob;
        double Snip42;
        double Snip42ob;
        double Sniposedall;
        double Sniposedallob;
        System.out.print("введите дебит продуваемой скважины");
        qskv = num.nextDouble();
        System.out.print("Продолжительность продувки скважины при заданных режимах");
        tsks = num.nextDouble();
        System.out.print("количество продувок");
        npr = num.nextDouble();
        System.out.print("количество скважин");
        nskv = num.nextDouble();
        Vskv = qskv * tsks * npr * nskv; //расчет
        System.out.println("расход газа на продувку скважин" + Vskv);
        System.out.println("количеситво стабильного конденсата полученного в результате дегазации н/с конденсата");
        qstkond = num.nextDouble();
        System.out.println("Газовый фактор, количество газа дегазации, выделяющегося при получении 1 конденсата");
        nkol = num.nextDouble();
        Qdeg = qstkond * nkol / 1000; // расчет
        System.out.println("Расход газа при дегазации конденсата" + Qdeg);
        System.out.println ("Общий объем сырьевого газа, подаваемого на УКПГ Аслан");
        vobshukpg = num.nextDouble();
        System.out.println("Удельный объем воды, выделяемой из газа Мубарекского НГДУ (результат ГКИ)");
        qb = num.nextDouble();
        System.out.println ("Растворимость газа, в дистилированной воде при давлении, соответствующем давлению газа перед выветривателем");
        rdb = num.nextDouble();
        System.out.println("Коэффициент Сеченова, определяемый по табл D2");
        k = num.nextDouble();
        System.out.println("Концентрация солей в воде(лабораторные исследования)");
        c = num.nextDouble();
        qgaz = rdb * Math.pow(10,-k * c);
        System.out.println("удельное сопротивление" + qgaz);
        Qdeg2 = vobshukpg * qgaz * qb   / 1000;
        System.out.println("расход газа при дегазации" + Qdeg2);
        System.out.println("общий объем сырьевого газа, подаваемого на УКПГ Алан");
        vobshukpg1 = num.nextDouble();
        System.out.println("Удельное количество впрыскиваемого ДЭГ");
        Udeg = num.nextDouble();
        System.out.println("Рабочее давление");
        P = num.nextDouble();
        System.out.println("Рабочая температура");
        T = num.nextDouble();
        System.out.println("Концентрация ДЭГ");
        C = num.nextDouble();
        Vreg = vobshukpg1 * Udeg;
        System.out.println("Объем регенерируемого раствора ДЭГ" + Vreg);
        A = 1.415 * C / 1000 + 5.78 * Math.pow(C,2)/1000000 + 1.43 * T * C / 100000 + 3.57 * Math.pow(T,2) / 1000000 -7.048/100;
        System.out.println("Коэффициент, зависящий от температуры и концентрации ДЭГ" + A);
        qdeg1 = P * A;
        System.out.println("Растворимость газа в растворе ДЭГ"+ qdeg1);
        Qreg = qdeg1 * Vreg/1000;
        System.out.println("Расход газа при дегазации пластовой воды" + Qreg);
        System.out.println("Расход топливного газа на агрегаты ДКС-1");
        rash71 = num.nextDouble();
        System.out.println("Расход топливного газа  на работу БПГР ДКС");
        rash72 = num.nextDouble();
        System.out.println("Расход топливного газа огненными регенераторами ДЭГ");
        Qdeg8 = num.nextDouble();
        System.out.println("Расход топливного газа на факел при аварийном останове промсла ДКС (показания по прибору");
        Qkoteldkc =num.nextDouble();
        System.out.println("Расход топливного газа на работу котельной УКПГ(показания по прибору)");
        Qkotelukpg = num.nextDouble();
        System.out.println("Расход газа на факел при аварийном останове промысла ДКС(показания по прибору)");
        Qfakeldkc = num.nextDouble();
        System.out.println("Расход газа на факел при аварийном останове промысла УКПГ (показани по прибору)");
        Qfakelukpg = num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения");
        qutechukpg =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период");
        tukpg =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявщих герметичность");
        yukpg =num.nextDouble();
        System.out.println("Количество единиц однотипных соединений(уплотнений)");
        nukpg =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям");
        pgukpg =num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ");
        qutechgp = num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период");
        tgp = num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009)");
        ugp = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений)");
        ngp = num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям");
        pggp = num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ");
        qutechdkc =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период");
        tdkc =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009)");
        udkc = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений)");
        ndkc =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям");
        pgdkc =num.nextDouble();
        rash111 = ((qutechukpg * tukpg * yukpg * nukpg / pgukpg)+(qutechgp * tgp * ugp *ngp/pggp)+(qutechdkc * tdkc * udkc * ndkc/pgdkc))/1000;
        System.out.println("Промежуточный расчет 1" +" "+ rash111);


        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechukpg1 =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tukpg1 =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявщих герметичность ГП Алан МГПЗ");
        yukpg1 =num.nextDouble();
        System.out.println("Количество единиц однотипных соединений(уплотнений) ГП Алан МГПЗ");
        nukpg1 =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pgukpg1 =num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechgp1 = num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tgp1 = num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009)ГП Алан МГПЗ");
        ugp1 = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений)ГП Алан МГПЗ");
        ngp1 = num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pggp1 = num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechdkc1 =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tdkc1 =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009) ГП Алан МГПЗ");
        udkc1 = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений) ГП Алан МГПЗ");
        ndkc1 =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pgdkc1 =num.nextDouble();
        rash112 = ((qutechukpg1 * tukpg1 * yukpg1 * nukpg1 / pgukpg1)+(qutechgp1 * tgp1 * ugp1 *ngp1/pggp1)+(qutechdkc1 * tdkc1 * udkc1 * ndkc1/pgdkc1))/1000;
        System.out.println("Промежуточный расчет 2" +" "+ rash112);

        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechukpg2 =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tukpg2 =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявщих герметичность ГП Алан МГПЗ");
        yukpg2 =num.nextDouble();
        System.out.println("Количество единиц однотипных соединений(уплотнений) ГП Алан МГПЗ");
        nukpg2 =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pgukpg2 =num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechgp2 = num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tgp2 = num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009)ГП Алан МГПЗ");
        ugp2 = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений)ГП Алан МГПЗ");
        ngp2 = num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pggp2 = num.nextDouble();
        System.out.println("Утечка газа через неподвижные или подвижные соединения ГП Алан МГПЗ");
        qutechdkc2 =num.nextDouble();
        System.out.println("Фонд рабочего времени за анализируемый период ГП Алан МГПЗ");
        tdkc2 =num.nextDouble();
        System.out.println("Доля соединений (уплотнений), потерявших герметичность (Приложения E NGH 39.2-66:2009) ГП Алан МГПЗ");
        udkc2 = num.nextDouble();
        System.out.println("Количество единиц однотипных соединений (уплотнений) ГП Алан МГПЗ");
        ndkc2 =num.nextDouble();
        System.out.println("Среднестатистическая за анализируемый период плотность газа, принимается по лаб.исследованиям ГП Алан МГПЗ");
        pgdkc2 =num.nextDouble();
        rash113 = ((qutechukpg2 * tukpg2 * yukpg2 * nukpg2 / pgukpg2)+(qutechgp2 * tgp2 * ugp2 *ngp2/pggp2)+(qutechdkc2 * tdkc2 * udkc2 * ndkc2/pgdkc2))/1000;
        System.out.println("Промежуточный расчет 2" +" "+ rash113);
        System.out.println("Количество воды, извлеченной на УКПГ");
        Gvodi = num.nextDouble();
        System.out.println("Молеклярная масса воды");
        MH2O = num.nextDouble();
        System.out.println("Количество нестабильного конденсата на УКПГ");
        Gnestkond =num.nextDouble();
        System.out.println("Средняя молекулярная масса нестабильного конденсата (результаты ГКИ)");
        Mnestkond =num.nextDouble();
        Qupb = Gvodi/MH2O * 24.04;
        System.out.println("Расход (оседание) газа с извлечением влаги " + Qupb);
        Qupnest = Gnestkond / Mnestkond * 24.04;
        System.out.println("Расход (оседание) газа на производство нестабильного конденсата" + Qupnest);
        Snipobg = vobshukpg * 1000;
        Snip11 = Vskv; //Надо доработать
        Snip12 = 0; //Надо доработать
        Snip13 = 0; //Надо доработать
        Snip14 = Qdeg;
        Snip15 = Qdeg2;
        Snip16 = Qreg;
        Sniptopnujd = Snip21 + Snip22 + Snip23 + Snip24 +Snip25 + Snip26 + Snip27;
        Snip21 = rash71;
        Snip22 = rash72;
        Snip23 = Qdeg8;
        Snip24 = Qkoteldkc;
        Snip25 = Qkotelukpg;
        Snip26 = Qfakeldkc;
        Snip27 = Qfakelukpg;
        Snipoter = Snip31 +Snip32 + Snip33;
        Snip31 = rash111;
        Snip32 = rash112;
        Snip33 = rash113;
        Sniposed = Snip41;
        Snip41 = Qupb;
        Snip42 = Qupnest;
        System.out.println("Объем газа, подаваемого на УКПГ «Алан»" + " " + Snipobg);
        Sniptechnujd = Snip11 + Snip12 + Snip13 + Snip14 + Snip15 +Snip16;
        Snipall = Sniptechnujd + Sniptopnujd + Snipoter;
        System.out.println("СНиП всего" + " " + Snipall);
        System.out.println("Технологические нетопливные нужды, в том числе:" +" " + Sniptechnujd);

        Snipsallob = Sniptechnujdob +Sniptopnujdob + Snipoterob;
        Sniptechnujdob = Snip11ob +Snip12ob +Snip13ob + Snip14ob + Snip15ob + Snip16ob;
        Snip11ob = Snip11 / Snipobg * 100;
        Snip12ob = Snip12 / Snipobg * 100;
        Snip13ob = Snip13 / Snipobg * 100;
        Snip14ob = Snip14 / Snipobg * 100;
        Snip15ob = Snip15 / Snipobg * 100;
        Snip16ob = Snip16 / Snipobg * 100;
        Sniptopnujdob =Snip21ob + Snip22ob + Snip23ob + Snip24ob + Snip25ob + Snip26ob + Snip27ob;
        Snip21ob = Snip21 / Snipobg * 100;
        Snip22ob = Snip22 / Snipobg * 100;
        Snip23ob = Snip23 / Snipobg * 100;
        Snip24ob = Snip24 / Snipobg * 100;
        Snip25ob = Snip25 / Snipobg * 100;
        Snip26ob = Snip26 / Snipobg * 100;
        Snip27ob = Snip27 / Snipobg * 100;
        Snipoterob = Snip31ob + Snip32ob + Snip33ob ;
        Snip31ob = Snip31 / Snipobg *100;
        Snip32ob = Snip32 / Snipobg *100;
        Snip33ob = Snip33 / Snipobg *100;
        Sniposedob = Snip41ob +Snip42ob;
        Snip41ob = Snip41 / Snipobg * 100;
        Snip42ob = Snip42 / Snipobg * 100;
        Sniposedallob = Snipsallob + Sniposedob;





    }
}


