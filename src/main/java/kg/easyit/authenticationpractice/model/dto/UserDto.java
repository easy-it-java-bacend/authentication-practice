package kg.easyit.authenticationpractice.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
   Long id;
   String firstName;
   String lastName;
   String email;

   @JsonIgnore
   String password;
   String username;
}
