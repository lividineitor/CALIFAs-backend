package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.PptDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class InlineResponse2001   {
  @JsonProperty("ppts")
  @Valid
  private List<PptDto> ppts = null;

  public InlineResponse2001 ppts(List<PptDto> ppts) {
    this.ppts = ppts;
    return this;
  }

  public InlineResponse2001 addPptsItem(PptDto pptsItem) {
    if (this.ppts == null) {
      this.ppts = new ArrayList<PptDto>();
    }
    this.ppts.add(pptsItem);
    return this;
  }

  /**
   * Get ppts
   * @return ppts
   **/
  @Schema(description = "")
      @Valid
    public List<PptDto> getPpts() {
    return ppts;
  }

  public void setPpts(List<PptDto> ppts) {
    this.ppts = ppts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.ppts, inlineResponse2001.ppts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ppts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    ppts: ").append(toIndentedString(ppts)).append("\n");
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
