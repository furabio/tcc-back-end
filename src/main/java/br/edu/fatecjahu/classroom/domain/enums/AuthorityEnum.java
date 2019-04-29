package br.edu.fatecjahu.classroom.domain.enums;

public enum AuthorityEnum {

    ADMIN(1L, "ROLE_ADMIN"),
    USER(2L, "ROLE_USER");

    private Long cod;
    private String desc;

    AuthorityEnum(Long cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public Long getCod() {
        return this.cod;
    }

    public String getDescricao() {
        return this.desc;
    }

    public static AuthorityEnum toEnum(Long cod) {

        if (cod == null) {
            return null;
        }

        for (AuthorityEnum x : AuthorityEnum.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Invalid : " + cod);
    }
}
