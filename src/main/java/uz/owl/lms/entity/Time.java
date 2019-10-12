package uz.owl.lms.entity;

public enum Time {
    DUSHANBA_1(1, "DUSHANBA"),
    DUSHANBA_2(2, "DUSHANBA"),
    DUSHANBA_3(3, "DUSHANBA"),
    DUSHANBA_4(4, "DUSHANBA"),
    DUSHANBA_5(5, "DUSHANBA"),
    DUSHANBA_6(6, "DUSHANBA"),
    DUSHANBA_7(7, "DUSHANBA"),

    SESHANBA_1(1, "SESHANBA"),
    SESHANBA_2(2, "SESHANBA"),
    SESHANBA_3(3, "SESHANBA"),
    SESHANBA_4(4, "SESHANBA"),
    SESHANBA_5(5, "SESHANBA"),
    SESHANBA_6(6, "SESHANBA"),
    SESHANBA_7(7, "SESHANBA"),

    CHORSHANBA_1(1, "CHORSHANBA"),
    CHORSHANBA_2(2, "CHORSHANBA"),
    CHORSHANBA_3(3, "CHORSHANBA"),
    CHORSHANBA_4(4, "CHORSHANBA"),
    CHORSHANBA_5(5, "CHORSHANBA"),
    CHORSHANBA_6(6, "CHORSHANBA"),
    CHORSHANBA_7(7, "CHORSHANBA"),

    PAYSHANBA_1(1, "PAYSHANBA"),
    PAYSHANBA_2(2, "PAYSHANBA"),
    PAYSHANBA_3(3, "PAYSHANBA"),
    PAYSHANBA_4(4, "PAYSHANBA"),
    PAYSHANBA_5(5, "PAYSHANBA"),
    PAYSHANBA_6(6, "PAYSHANBA"),
    PAYSHANBA_7(7, "PAYSHANBA"),

    JUMA_1(1, "JUMA"),
    JUMA_2(2, "JUMA"),
    JUMA_3(3, "JUMA"),
    JUMA_4(4, "JUMA"),
    JUMA_5(5, "JUMA"),
    JUMA_6(6, "JUMA"),
    JUMA_7(7, "JUMA"),

    SHANBA_1(1, "SHANBA"),
    SHANBA_2(2, "SHANBA"),
    SHANBA_3(3, "SHANBA"),
    SHANBA_4(4, "SHANBA"),
    SHANBA_5(5, "SHANBA"),
    SHANBA_6(6, "SHANBA"),
    SHANBA_7(7, "SHANBA"),;

    int para;
    String day;

    Time(int para, String day) {
        this.para = para;
        this.day = day;
    }
}
