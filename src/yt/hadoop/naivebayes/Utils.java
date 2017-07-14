package yt.hadoop.naivebayes;

public class Utils {
	private static final String BASE_PATH = "hdfs://192.168.95.100:9000/user/yt/";
	
	public static final String BASE_TRAINDATA_PATH = "hdfs://192.168.95.100:9000/user/yt/Country";
	
	public static final String BASE_TESTDATA_PATH = "hdfs://192.168.95.100:9000/user/yt/test";
	
	public static final String SEQUENCE_INPUT_TRAIN_DATA = BASE_PATH + "InputSequenceTrainData";
	
	public static final String SEQUENCE_INPUT_TEST_DATA = BASE_PATH + "InputSequenceTestData";
	
	public static final String DOC_NUM_IN_CLASS_OUTPUT_PATH = BASE_PATH + "DocNumInClass";
	
	public static final String EACH_WORD_NUM_IN_CLASS_OUTPUT_PATH = BASE_PATH + "EachWordNumInClass";
	
	public static final String ALL_WORD_NUM_IN_CLASS_OUTPUT_PATH = BASE_PATH + "AllWordNumInClass";
	
	public static final String ALL_WORD_IN_TRAIN_OUTPUT_PATH = BASE_PATH + "AllWordInTrainData";
	
	public static final String RESULT_OF_CLASSFICATION = BASE_PATH + "ResultOfClassfication";
	
	public static String FILE = "hdfs://192.168.95.100:9000/user/yt/Country/classgroup.txt"; // 输出ClassGroup文件
}
