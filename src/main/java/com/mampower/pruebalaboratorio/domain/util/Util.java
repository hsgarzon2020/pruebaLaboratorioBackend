package com.mampower.pruebalaboratorio.domain.util;

public class Util {

    public static final String CODE_SUCCESS = "0";
    public static final String MESSAGE_SUCCESS = "Success";
    public static final String CODE_FAILED = "-1";
    public static final String MESSAGE_FAILED = "Error";
    public static String patientRisk(Float sugar, Float fat, Float oxygen) {

        if (sugar > 70 && fat > 88.5 && oxygen < 60) {
            return "ALTO";
        } else if (sugar > 50 && sugar <= 70
                && fat >= 62.2 && fat <= 88.5
                && oxygen >= 60 && oxygen <= 70) {
            return "MEDIO";
        } else if (sugar < 50 && fat < 62.2 && oxygen > 70) {
            return "BAJO";
        }
        return "Paciente sin riesgo";
    }

}
