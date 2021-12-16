package io.getarrays.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import io.getarrays.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	@NotEmpty(message = "IP Address can not be emtpy or null")
	private String ipAdress;
	private String name;
	private String memory;
	private String type;
	private String imageUrl;
	private Status status;
	
}
