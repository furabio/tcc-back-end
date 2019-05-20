package br.edu.fatecjahu.classroom.domain.model.enums;

public enum PeriodTypeEnum {
    MANHA(1L, "MANHÃ"),
    TARDE(2L, "TARDE"),
    NOITE(3L, "NOITE");

    private Long key;
    private String description;

    PeriodTypeEnum(Long key, String description) {
        this.key = key;
        this.description = description;
    }

    public Long getKey() {
        return key;
    }

    public static PeriodTypeEnum toEnum(Long key) {

        if (key == null) {
            return null;
        }

        for (PeriodTypeEnum x : PeriodTypeEnum.values()) {
            if (key.equals(x.getKey())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Invalid : " + key);
    }
}
