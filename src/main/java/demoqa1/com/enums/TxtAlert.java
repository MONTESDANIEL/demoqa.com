package demoqa1.com.enums;

public enum TxtAlert {
    TXT_ALERT("Click me");

    private final String mensaje1;

    TxtAlert(String mensaje1){
        this.mensaje1 = mensaje1;
    }
    public String getMesaje (){return mensaje1;}
}
