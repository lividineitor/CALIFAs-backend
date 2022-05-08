package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V1UsuariosBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class LoginDto   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  public LoginDto nombre(String email) {
    this.email = email;
    return this;
  }

  /**
   * El nombre de usuario.
   * @return nombre
   **/
  @Schema(example = "fulanito@de.tal", required = true, description = "El nombre de usuario.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * La contraseña del usuario.
   * @return password
   **/
  @Schema(example = "losFulanitosSonPersonas", required = true, description = "La contraseña del usuario.")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginDto v1UsuariosBody = (LoginDto) o;
    return Objects.equals(this.email, v1UsuariosBody.email) &&
        Objects.equals(this.password, v1UsuariosBody.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UsuariosBody {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
