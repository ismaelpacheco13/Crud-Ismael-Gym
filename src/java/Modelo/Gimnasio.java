package Modelo;

public class Gimnasio {

  private int codGim;
  private String nomGim;
  private String dirGim;
  private String horGim;
  private String claGim;
  
  public Gimnasio() {
    
  }

  public Gimnasio(int codGim, String nomGim, String dirGim, String horGim, String claGim) {
    this.codGim = codGim;
    this.nomGim = nomGim;
    this.dirGim = dirGim;
    this.horGim = horGim;
    this.claGim = claGim;
  }

  public int getCodGim() {
    return codGim;
  }

  public void setCodGim(int codGim) {
    this.codGim = codGim;
  }

  public String getNomGim() {
    return nomGim;
  }

  public void setNomGim(String nomGim) {
    this.nomGim = nomGim;
  }

  public String getDirGim() {
    return dirGim;
  }

  public void setDirGim(String dirGim) {
    this.dirGim = dirGim;
  }

  public String getHorGim() {
    return horGim;
  }

  public void setHorGim(String horGim) {
    this.horGim = horGim;
  }

  public String getClaGim() {
    return claGim;
  }

  public void setClaGim(String claGim) {
    this.claGim = claGim;
  }
  
}
