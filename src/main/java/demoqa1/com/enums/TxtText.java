package demoqa1.com.enums;

public enum TxtText {
    TXT_TEXT("White");
    private final String mensaje;

    TxtText(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
