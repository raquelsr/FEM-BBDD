package fem.miw.upm.es.ejemplobbdd.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Raquel on 19/10/17.
 */

public class EntidadCliente implements Parcelable {

    private String nombre;
    private String dni;
    private int telefono;
    private String mail;
    private boolean verificado;

    public EntidadCliente(String nombre, String dni, int telefono, String mail, boolean verificado) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.verificado = verificado;
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

    protected EntidadCliente(Parcel in) {
        nombre = in.readString();
        dni = in.readString();
        telefono = in.readInt();
        mail = in.readString();
        verificado = in.readByte() != 0x00;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(dni);
        dest.writeInt(telefono);
        dest.writeString(mail);
        dest.writeByte((byte) (verificado ? 0x01 : 0x00));
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<EntidadCliente> CREATOR = new Parcelable.Creator<EntidadCliente>() {
        @Override
        public EntidadCliente createFromParcel(Parcel in) {
            return new EntidadCliente(in);
        }

        @Override
        public EntidadCliente[] newArray(int size) {
            return new EntidadCliente[size];
        }
    };
}
