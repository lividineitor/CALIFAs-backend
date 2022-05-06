package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TokenDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class TokenDto   {
  @JsonProperty("tokenId")
  private BigDecimal tokenId = null;

  @JsonProperty("token")
  private String token = null;

  public TokenDto tokenId(BigDecimal tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * El identificador del usuario.
   * @return tokenId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del usuario.")
      @NotNull

    @Valid
    public BigDecimal getTokenId() {
    return tokenId;
  }

  public void setTokenId(BigDecimal tokenId) {
    this.tokenId = tokenId;
  }

  public TokenDto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Llave temporal del usuario.
   * @return token
   **/
  @Schema(example = "Adsfsl2342", required = true, description = "Llave temporal del usuario.")
      @NotNull

    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDto tokenDto = (TokenDto) o;
    return Objects.equals(this.tokenId, tokenDto.tokenId) &&
        Objects.equals(this.token, tokenDto.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDto {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
