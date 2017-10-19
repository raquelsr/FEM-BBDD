package fem.miw.upm.es.ejemplobbdd.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Raquel on 19/10/17.
 */

public class EntidadCliente implements Parcelable {

    private int id;
    private String nombre;
    private String dni;
    private int telefono;
    private String mail;
    private boolean verificado;

    /*

     */

    public EntidadCliente(int id, String nombre, String dni, int telefono, String mail, boolean verificado) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.verificado = verificado;
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    // Parcelable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
        dest.writeString(this.dni);
        dest.writeInt(this.telefono);
        dest.writeString(this.mail);
        dest.writeByte(this.verificado ? (byte) 1 : (byte) 0);
    }

    protected EntidadCliente(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
        this.dni = in.readString();
        this.telefono = in.readInt();
        this.mail = in.readString();
        this.verificado = in.readByte() != 0;
    }

    public static final Creator<EntidadCliente> CREATOR = new Creator<EntidadCliente>() {
        @Override
        public EntidadCliente createFromParcel(Parcel source) {
            return new EntidadCliente(source);
        }

        @Override
        public EntidadCliente[] newArray(int size) {
            return new EntidadCliente[size];
        }
    };
}
