package hex.schemas;

import com.google.auto.service.AutoService;
import hex.word2vec.Word2VecModel;
import water.api.Schema;
import water.api.schemas3.ModelOutputSchemaV3;
import water.api.schemas3.ModelSchemaV3;

@AutoService(Schema.class)
public class Word2VecModelV3 extends ModelSchemaV3<Word2VecModel, Word2VecModelV3, Word2VecModel.Word2VecParameters, Word2VecV3.Word2VecParametersV3, Word2VecModel.Word2VecOutput, Word2VecModelV3.Word2VecModelOutputV3> {

  @AutoService(Schema.class)
  public static final class Word2VecModelOutputV3 extends ModelOutputSchemaV3<Word2VecModel.Word2VecOutput, Word2VecModelOutputV3> {
  } // Word2VecModelOutputV2


  //==========================
  // Custom adapters go here
  public Word2VecV3.Word2VecParametersV3 createParametersSchema() { return new Word2VecV3.Word2VecParametersV3(); }
  public Word2VecModelOutputV3 createOutputSchema() { return new Word2VecModelOutputV3(); }

  // Version&Schema-specific filling into the impl
  @Override public Word2VecModel createImpl() {
    Word2VecModel.Word2VecParameters parms = parameters.createImpl();
    return new Word2VecModel( model_id.key(), parms, null);
  }
}
