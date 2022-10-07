package model;

public enum CarrerasEstudiante {
    ICII("Ingeniería Civil Industrial mencion Informática"),
    ICIB("Ingeniería Civil Industrial mención Bioprocesos"),
    ICIM("Ingeniería Civil Industrial mención mecánica"),
    ITELEMATICA("Ingeniería en Telemátia"),
    INGENIERIAMTEMATICA("Ingeniería en Matenática");

    private String carrerasEstudiante;

    private CarrerasEstudiante(String carrerasEstudiante) {
        this.carrerasEstudiante = carrerasEstudiante;
    }

    public String getCarrerasEstudiante() {
        return carrerasEstudiante;
    }
}
