package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.UsuarioDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class InlineResponse200   {
  @JsonProperty("usuarios")
  @Valid
  private List<UsuarioDto> usuarios = null;

  public InlineResponse200 usuarios(List<UsuarioDto> usuarios) {
    this.usuarios = usuarios;
    return this;
  }

  public InlineResponse200 addUsuariosItem(UsuarioDto usuariosItem) {
    if (this.usuarios == null) {
      this.usuarios = new ArrayList<UsuarioDto>();
    }
    this.usuarios.add(usuariosItem);
    return this;
  }

  /**
   * Get usuarios
   * @return usuarios
   **/
  @Schema(description = "")
      @Valid
    public List<UsuarioDto> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(List<UsuarioDto> usuarios) {
    this.usuarios = usuarios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.usuarios, inlineResponse200.usuarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    usuarios: ").append(toIndentedString(usuarios)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
