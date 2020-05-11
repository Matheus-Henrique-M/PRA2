#PRA2

/*
Nome Matheus Henrique
Número 21
Turma INF2EM
*/
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
@Entity(tableName = "ocurrences")//criação da entidade

public class Ocurrences{
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "ocurrencesId")
	private int mId; //identificador único

	@Nullable
	@ColumnInfo(name = "ocurrencesCreationDate")
	//private String mCreationDate;
	
	@Nullable
	@ColumnInfo(name = "ocurrencesDescription")
	private String mDescription; //descrição da ocorrencia

	@Nullable
	@ColumnInfo(name = "ocurrencesForwarding")
	private String mForwarding; //Anotação do encaminhamento da ocorrencia

	@Nullable
	@ColumnInfo(name = "ocorrencesGrade")
	//privare int mGrade; 
	
    //Acima criei todas as colunas da classe Ocurrences
	
	public Ocurrences(@Nullable String creationdate, String description, String forwarding, int Grade) {
    mCreationDate = creationdate;
    mDescription = description;
    mFrowarding = forwarding;
    mGrade = grade;
	}
    
	//Gerando getters and setters
	
	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		mId = Id;
	}

	public String getCreationDate() {
		return mCreationDate;
	}

	public void setaCreationDate(String CreationDate) {
		mCreationDate = CreationDate;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String mDescription) {
		mDescription = Description;
	}

	public String getForwarding () {
		return aForwarding;
	}

	public void setForwarding (String mForwarding) {
		mForwarding = Forwarding;
	}

	public int getGrade() {
		return mGrade;
	}

	public void setGrade (int mGrade) {
		mGrade = Grade;
	}
	
  private int mGrade; //nível de impacto da ocorrência (-5 a +5)
  private String mCreationDate;//data de controle para o Banco De Dados

}
