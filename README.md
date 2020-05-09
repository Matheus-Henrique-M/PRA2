# PRA2
/*
Nome Matheus Henrique
Número 21
Turma INF2EM
*/

@Entity
@Entity(tableName = "ocurrences")//criação da entidade

public class Ocurrences{
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "ocurrencesId")
	private int aId; //identificador único

	@Nullable
	@ColumnInfo(name = "ocurrencesCreationDate")
	//private String aCreationDate;
	
	@Nullable
	@ColumnInfo(name = "ocurrencesDescription")
	private String aDescription; //descrição da ocorrencia

	@Nullable
	@ColumnInfo(name = "ocurrencesForwarding")
	private String aForwarding; //Anotação do encaminhamento da ocorrencia

	@Nullable
	@ColumnInfo(name = "ocorrencesGrade")
	//privare int aGrade; 
	
    //Acima criei todas as colunas da classe Ocurrences
	
	public Ocurrences(@Nullable String creationdate, String description, String forwarding, int Grade) {
    aCreationDate = creationdate;
    aDescription = description;
    aFrowarding = forwarding;
    aGrade = grade;
	}
    
	//Gerando getters and setters
	
	public int getId() {
		return aId;
	}

	public void setId(int aId) {
		aId = Id;
	}

	public String getCreationDate() {
		return aCreationDate;
	}

	public void setaCreationDate(String CreationDate) {
		aCreationDate = CreationDate;
	}

	public String getDescription() {
		return aDescription;
	}

	public void setDescription(String aDescription) {
		aDescription = Description;
	}

	public String getForwarding () {
		return aForwarding;
	}

	public void setForwarding (String aForwarding) {
		mForwarding = Forwarding;
	}

	public int getGrade() {
		return aGrade;
	}

	public void setGrade (int aGrade) {
		aGrade = Grade;
	}
	
  private int aGrade; //nível de impacto da ocorrência (-5 a +5)
  private String aCreationDate;//data de controle para o Banco De Dados

}
