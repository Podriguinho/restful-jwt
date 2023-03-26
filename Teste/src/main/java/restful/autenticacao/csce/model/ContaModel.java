package restful.autenticacao.csce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "conta")
public class ContaModel {


    @Column(name = "friendlyName")
    private String friendlyName;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "currencyCode")
    private String currencyCode;

    @Column(name = "referenceAccountNumber")
    private String referenceAccountNumber;

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "value", column = @Column(name = "actualBalance_value")),
            @AttributeOverride( name = "currency", column = @Column(name = "actualBalance_currency")),
            @AttributeOverride( name = "displayCurrencyCode", column = @Column(name = "actualBalance_displayCurrencyCode")),
            @AttributeOverride( name = "displayText", column = @Column(name = "actualBalance_displayText"))
    })
    private Balance  actualBalance;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "value", column = @Column(name = "availableBalance_value")),
            @AttributeOverride( name = "currency", column = @Column(name = "availableBalance_currency")),
            @AttributeOverride( name = "displayCurrencyCode", column = @Column(name = "availableBalance_displayCurrencyCode")),
            @AttributeOverride( name = "displayText", column = @Column(name = "availableBalance_displayText"))
    })
    private Balance  availableBalance;

    @Column(name = "accountHolderId")
    private String accountHolderId;

    @Column(name = "oldAccountNumber")
    private String oldAccountNumber;

    @Column(name = "accountStatus")
    private String accountStatus;

    @Column(name = "createdDateTime")
    private LocalDateTime createdDateTime;

    @Column(name = "externalReference")
    private String externalReference;


}
