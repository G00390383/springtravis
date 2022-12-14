package io.github.anantharajuc.sbmwa.domain.model.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@MappedSuperclass
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class AuditEntity extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column(name="created_date", nullable=true, updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdDate;
	
	@Column(name="last_modified_date", nullable=true, updatable=true)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    Date lastModifiedDate;
}
