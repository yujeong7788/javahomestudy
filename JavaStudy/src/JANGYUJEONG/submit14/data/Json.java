package JANGYUJEONG.submit14.data;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	
	public static void main(String[] args){
		
		String data = "{\"total_count\":\"1114\",\"row\":[{\"RCP_PARTS_DTLS\":\"새우두부계란찜\\n연두부 75g(3/4모), 칵테일새우 20g(5마리), 달걀 30g(1/2개), 생크림 13g(1큰술), 설탕 5g(1작은술), 무염버터 5g(1작은술)\\n고명\\n시금치 10g(3줄기)\",\"RCP_WAY2\":\"찌기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"28\",\"INFO_NA\":\"99\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"14\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"17\",\"HASH_TAG\":\"연두부\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_3.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_1.png\",\"MANUAL01\":\"1. 손질된 새우를 끓는 물에 데쳐 건진다.a\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00028_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 연두부, 달걀, 생크림, 설탕에 녹인 무염버터를 믹서에 넣고 간 뒤 새우(1)를 함께 섞어 그릇에 담는다.b\",\"MANUAL03\":\"3. 시금치를 잘게 다져 혼합물 그릇(2)에 뿌리고 찜기에 넣고 중간 불에서 10분 정도 찐다.c\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00028_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"3\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"나트륨의 배출을 도와주는 것으로 알려진 칼륨이 풍부한 시금치와 소금, 간장 등의 양념 대신 새우에 들어있는 간으로 맛을 내요.\",\"INFO_ENG\":\"220\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"새우 두부 계란찜\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"[1인분]조선부추 50g, 날콩가루 7g(1⅓작은술)\\n·양념장 : 저염간장 3g(2/3작은술), 다진 대파 5g(1작은술), 다진 마늘 2g(1/2쪽), 고춧가루 2g(1/3작은술), 요리당 2g(1/3작은술), 참기름 2g(1/3작은술), 참깨 약간\",\"RCP_WAY2\":\"찌기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"29\",\"INFO_NA\":\"240\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"14\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"9\",\"HASH_TAG\":\"날콩가루\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054834_1675673314720.jpg\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054908_1675673348152.jpg\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054820_1675673300714.jpg\",\"MANUAL01\":\"1. 부추는 깨끗이 씻어 물기를 제거하고, 5cm 길이로 썰고 부추에 날콩가루를 넣고 고루 섞이도록 버무린다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00029_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 찜기에 면보를 깔고 부추를 넣은 후 김이 오르게 쪄서 파랗게 익힌다.\",\"MANUAL03\":\"3. 저염간장에 다진 대파, 다진 마늘, 고춧가루, 요리당 , 참기름, 참깨를 섞어 양념장을 만들고 찐 부추는 그릇에 담아낸다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00029_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"20\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"콩가루로 버무려 감칠맛과 고소한 맛으로 나트륨 사용량을 줄여보세요. 부추는 피를 맑게 하고 허약 체질을 개선하여 성인병을 예방하는데 효과가 있지만, 알레르기 체질이나 위장이 약한 사람은 부작용이 생길 수 있으니 주의하세요.\",\"INFO_ENG\":\"215\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"부추 콩가루 찜\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●방울토마토 소박이 : \\n방울토마토 150g(5개), 양파 10g(3×1cm), 부추 10g(5줄기)\\n●양념장 : \\n고춧가루 4g(1작은술), 멸치액젓 3g(2/3작은술), 다진 마늘 2.5g(1/2쪽), 매실액 2g(1/3작은술), 설탕 2g(1/3작은술), 물 2ml(1/3작은술), 통깨 약간\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"31\",\"INFO_NA\":\"277\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"방울토마토\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_4.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_5.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_1.png\",\"MANUAL01\":\"1. 물기를 빼고 2cm 정도의 크기로 썰은 부추와 양파를 양념장에 섞어 양념속을 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00031_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 깨끗이 씻은 방울토마토는 꼭지를 떼고 윗부분에 칼로 십자모양으로 칼집을 낸다.\",\"MANUAL03\":\"3. 칼집을 낸 방울토마토에 양념속을 사이사이에 넣어 버무린다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00031_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"9\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"소금에 절이는 오이 대신 방울토마토를 사용하여 나트륨 섭취를 줄였어요. 토마토에는 과일에 대체로 없는 글루탐산이 풍부하여 감칠맛을 내주며, 겉절이 양념과 잘 어우러져 상큼함과 감칠맛을 내주어요.\",\"INFO_ENG\":\"45\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"방울토마토 소박이\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●오이무침 :\\n오이 70g(1/3개), 다진 땅콩 10g(1큰술)\\n●순두부사과 소스 : \\n순두부 40g(1/8봉지), 사과 50g(1/3개)\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"32\",\"INFO_NA\":\"22\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"4\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"2\",\"HASH_TAG\":\"순두부\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_3.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_1.png\",\"MANUAL01\":\"1. 사과, 순두부를 믹서에 넣고 곱게 갈아 소스를 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00032_2.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 오이는 소금으로 문질러 씻어 반을 갈라 씨를 제거하고 어슷썰기를 한다.\",\"MANUAL03\":\"3. 썰어 놓은 오이에 순두부사과 소스를 넣고 버무린 후 다진 땅콩을 뿌려 마무리 한다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00032_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"10\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"사과에는 팩틴이 풍부하여 체내 나쁜 콜레스테롤을 감소시키고 나트륨 배출을 촉진시켜줘요. 순두부와 사과를 갈아 만든 소스는 맵고 짠 자극적인 간이 아닌 재료 그대로의 새콤달콤한 맛과 깔끔한 맛을 내요.\",\"INFO_ENG\":\"75\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"순두부 사과 소스 오이무침\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"북엇국\\n북어채 25g(15개), 새우 10g(3마리), 사과 30g(1/5개), 양파 40g(1/4개),\\n표고버섯 20g(2장), 물 300ml(1½컵)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"33\",\"INFO_NA\":\"78\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"12\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_3.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_5.png\",\"MANUAL_IMG01\":\"\",\"MANUAL01\":\"\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00033_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"5. 그릇에 담아낸다.\",\"MANUAL02\":\"2. 북어채를 잘게 손으로 찢어 찬물에 헹구어 준비한 후 양파, 표고버섯, 사과는 채 썰고 새우는 등쪽의 두세 마디에 꼬챙이를 넣어 내장을 뺀 후 헹군다.\",\"MANUAL03\":\"3. 찬물에 북어채, 새우, 표고버섯, 양파를 넣고 20분 정도 끓인 후 사과를 넣어 북어의 씁쓸한 맛을 없앤다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00033_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"2\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"소금과 간장 대신 북어채와 새우의 짠맛으로 간을 한 담백한 맛의 북엇국을 만들었어요. 홍합이나 바지락을 넣으면 시원한 국물을 연출 할 수 있어요.\",\"INFO_ENG\":\"65\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"사과 새우 북엇국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"황태해장국\\n황태(채) 15g(10개), 콩나물 30g(1/6봉지), 무 30g(5×3×2cm), 저염된장 10g(2작은술), 물 300ml(1½컵), 청양고추 5g(1/2개), 다진 마늘 2g(1/3작은술)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"36\",\"INFO_NA\":\"361\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"13\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"0\",\"HASH_TAG\":\"저염된장\",\"MANUAL_IMG02\":\"\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_3.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_4.png\",\"MANUAL_IMG05\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_5.png\",\"MANUAL_IMG01\":\"\",\"MANUAL01\":\"\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00036_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"4. 냄비에 물을 붓고 황태와 무를 넣고 끓인 후 육수에서 물을 건져내고 저염 된장을 푼다.\",\"MANUAL05\":\"5. 콩나물, 다진 마늘, 청양고추를 넣고 뚜껑을 덮어 김이 나게 끓\\n여준다.\",\"MANUAL02\":\"\",\"MANUAL03\":\"3. 황태는 손질하여 물에 헹궈 건져 놓고 콩나물은 다듬어 씻고 청양고추는 어슷썰기 한다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00036_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"12\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"황태해장국을 조리할 때 소금 대신 저염된장을 사용하면 덜 짜고 감칠맛 나는 황태해장국을 맛 볼 수 있어요.\\n황태는 빛이 누렇고 살이 연한 것이 좋은 상품이며, 황태는 냉동실에 보관하거나 잘 밀봉하여 건조하고 서늘한 곳에 보관하는 것이 좋아요.\",\"INFO_ENG\":\"100\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"저염 된장으로 맛을 낸 황태해장국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"된장국\\n두부 20g(2×2×2cm), 애느타리버섯 20g(4가닥), 감자 10g(4×3×1cm), 양파 10g(2×1cm), 대파 10g(5cm), 된장 5g(1작은술), 물 300ml(1½컵)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"37\",\"INFO_NA\":\"260\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"0\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_4.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_6.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_2.png\",\"MANUAL01\":\"1. 감자, 양파는 얇게 썰고 애느타리 버섯은 썰어 달궈진 팬에 굽는다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00037_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 냄비에 물을 붓고 된장을 푼 뒤 감자, 양파, 두부를 넣어 재료가 투명해지게 끓인 후 된장국의 재료를 건져서 믹서에 넣어 갈고 된장국에 넣어 한번 더 끓인다.\",\"MANUAL03\":\"3. 구운 애느타리버섯과 대파를 국에 넣어 끓인 후 그릇에 담는다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00037_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"3\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"된장국의 된장 사용량을 줄이기 위해 두부와 감자 등의 재료를 갈아 넣으면 담백한 된장국을 맛볼 수 있어요.\\n된장의 양을 적게 사용함으로 나트륨 섭취를 줄일 수 있어요.\",\"INFO_ENG\":\"20\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"된장국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●멸치육수 : 국물용 멸치 5g(3마리), 다시마 1장(5×1cm), 양파 10g(2×1cm), 표고버섯 기둥, 국간장 5g(1작은술), 물 300ml(1½컵)\\n●채소준비 : 청경채 20g(1개), 표고버섯 20g(2장), 다진 마늘 2g(1/3작은술)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"38\",\"INFO_NA\":\"2441\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_4.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_1.png\",\"MANUAL01\":\"1. 찬물에 표고버섯,머리와 내장을 제거한 멸치,\\n다시마, 양파를 넣어 중간 불에서 10분 정도\\n끓여 멸치육수를 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00038_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 육수의 표고버섯 기둥, 멸치, 다시마, 양파를 건진 후 표고버섯은 편으로 썰고 청경채는 4cm 크기로 썬다.\",\"MANUAL03\":\"3. 끓는 육수에 준비한 표고버섯과 청경채를 넣고 국간장으로 간을 한 후 마늘을 넣어 한소끔 끓인다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00038_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"7\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"표고버섯 밑둥을 육수에 넣어 감칠맛을 더하고, 멸치와 다시마는 다량의 소금 없이도 국물 맛을 깊게 만들어 주는 역할을 해요. 건표고버섯은 햇볕에 말리는 과정에서 만들어진 비타민 D가 풍부해 칼슘 흡수를 도와 골다공증 예방에 좋은 식품이예요. 생표고버섯에는 비타민 D가 거의 들어있지 않아요.\",\"INFO_ENG\":\"45\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"표고버섯 청경채국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●치커리 샐러드 : 치커리 30g(10줄기), 적양배추 15g(5×3cm), 양파 10g(2×1cm), 당근 5g(3×1×1cm)\\n●올리브마늘 드레싱 : 올리브유 10g(2작은술), 식초 5g(1작은술), 설탕 5g(1작은술), 마늘 5g(1쪽)\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"95\",\"INFO_NA\":\"74\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"3\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"12\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_3.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_4.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_2.png\",\"MANUAL01\":\"1. 올리브유, 식초, 설탕, 다진 마늘을 섞어 거품기로 충분히 저어주어 올리브마늘 드레싱을 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00095_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 치커리는 싱싱하게 찬물에 담갔다가 물기를 뺀 후 한입 크기로 자르고, 적양배추, 양파, 당근은 곱게채를 썬다.\",\"MANUAL03\":\"3. 접시에 준비한 치커리, 적양배추, 양파, 당근을 담고 올리브마늘 드레싱을 뿌린다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00095_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"13\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"치커리를 육류와 함께 섭취하면 치커리의 산뜻한 맛으로 입맛을 돋우고 섬유소의 섭취를 늘릴 수 있으며 동맥경화를 예방하는데 도움이 된답니다. 치커리에는 칼륨이 많아 육류나 고나트륨 식사시 함께 섭취하면 체내나트륨 배출에 효과적이에요.\",\"INFO_ENG\":\"170\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"치커리샐러드와 올리브 마늘 소스\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"스트로베리 샐러드\\n딸기 70g(7개), 플레인요거트 85g(1개), 양상추 70g(2장), 메추리알 30g(3개), 블루베리 15g(1큰술), 식초 약간, 소금 약간\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"87\",\"INFO_NA\":\"138\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"7\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"5\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_4.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_1.png\",\"MANUAL01\":\"1. 찬물이 담긴 냄비에 식초, 소금을 넣고 메추리알을 삶는다. 물이 끓어오르면 5분 정도 더 삶아 찬물에 헹군 후 껍질을 벗기고 반으로 자른다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00087_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 딸기를 흐르는 물에 가볍게 씻어 꼭지를 제거한 후 물기를 빼고 반으로 자른다.\",\"MANUAL03\":\"3. 양상추는 찬물에 담갔다가 물기를 빼고 한입 크기로 찢은 후 접시에 양상추, 딸기, 블루베리, 메추리알을 담고 플레인요거트를 끼얹는다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00087_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"30\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"딸기는 칼륨이 풍부하여 나트륨 배출에 뛰어나지만 칼슘이 부족한 과일이예요. 그렇기 때문에 칼슘이 풍부한 요거트나 기타 유제품과 함께 섭취하면 좋아요.\",\"INFO_ENG\":\"195\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"스트로베리 샐러드\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"}],\"RESULT\":{\"MSG\":\"정상처리되었습니다.\",\"CODE\":\"INFO-000\"}}";
		
		String data2 = "{\"row\":[{\"RCP_PARTS_DTLS\":\"새우두부계란찜\\n연두부 75g(3/4모), 칵테일새우 20g(5마리), 달걀 30g(1/2개), 생크림 13g(1큰술), 설탕 5g(1작은술), 무염버터 5g(1작은술)\\n고명\\n시금치 10g(3줄기)\",\"RCP_WAY2\":\"찌기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"28\",\"INFO_NA\":\"99\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"14\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"17\",\"HASH_TAG\":\"연두부\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_3.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00028_1.png\",\"MANUAL01\":\"1. 손질된 새우를 끓는 물에 데쳐 건진다.a\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00028_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 연두부, 달걀, 생크림, 설탕에 녹인 무염버터를 믹서에 넣고 간 뒤 새우(1)를 함께 섞어 그릇에 담는다.b\",\"MANUAL03\":\"3. 시금치를 잘게 다져 혼합물 그릇(2)에 뿌리고 찜기에 넣고 중간 불에서 10분 정도 찐다.c\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00028_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"3\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"나트륨의 배출을 도와주는 것으로 알려진 칼륨이 풍부한 시금치와 소금, 간장 등의 양념 대신 새우에 들어있는 간으로 맛을 내요.\",\"INFO_ENG\":\"220\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"새우 두부 계란찜\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"[1인분]조선부추 50g, 날콩가루 7g(1⅓작은술)\\n·양념장 : 저염간장 3g(2/3작은술), 다진 대파 5g(1작은술), 다진 마늘 2g(1/2쪽), 고춧가루 2g(1/3작은술), 요리당 2g(1/3작은술), 참기름 2g(1/3작은술), 참깨 약간\",\"RCP_WAY2\":\"찌기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"29\",\"INFO_NA\":\"240\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"14\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"9\",\"HASH_TAG\":\"날콩가루\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054834_1675673314720.jpg\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054908_1675673348152.jpg\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/20230206/20230206054820_1675673300714.jpg\",\"MANUAL01\":\"1. 부추는 깨끗이 씻어 물기를 제거하고, 5cm 길이로 썰고 부추에 날콩가루를 넣고 고루 섞이도록 버무린다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00029_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 찜기에 면보를 깔고 부추를 넣은 후 김이 오르게 쪄서 파랗게 익힌다.\",\"MANUAL03\":\"3. 저염간장에 다진 대파, 다진 마늘, 고춧가루, 요리당 , 참기름, 참깨를 섞어 양념장을 만들고 찐 부추는 그릇에 담아낸다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00029_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"20\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"콩가루로 버무려 감칠맛과 고소한 맛으로 나트륨 사용량을 줄여보세요. 부추는 피를 맑게 하고 허약 체질을 개선하여 성인병을 예방하는데 효과가 있지만, 알레르기 체질이나 위장이 약한 사람은 부작용이 생길 수 있으니 주의하세요.\",\"INFO_ENG\":\"215\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"부추 콩가루 찜\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●방울토마토 소박이 : \\n방울토마토 150g(5개), 양파 10g(3×1cm), 부추 10g(5줄기)\\n●양념장 : \\n고춧가루 4g(1작은술), 멸치액젓 3g(2/3작은술), 다진 마늘 2.5g(1/2쪽), 매실액 2g(1/3작은술), 설탕 2g(1/3작은술), 물 2ml(1/3작은술), 통깨 약간\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"31\",\"INFO_NA\":\"277\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"방울토마토\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_4.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_5.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00031_1.png\",\"MANUAL01\":\"1. 물기를 빼고 2cm 정도의 크기로 썰은 부추와 양파를 양념장에 섞어 양념속을 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00031_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 깨끗이 씻은 방울토마토는 꼭지를 떼고 윗부분에 칼로 십자모양으로 칼집을 낸다.\",\"MANUAL03\":\"3. 칼집을 낸 방울토마토에 양념속을 사이사이에 넣어 버무린다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00031_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"9\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"소금에 절이는 오이 대신 방울토마토를 사용하여 나트륨 섭취를 줄였어요. 토마토에는 과일에 대체로 없는 글루탐산이 풍부하여 감칠맛을 내주며, 겉절이 양념과 잘 어우러져 상큼함과 감칠맛을 내주어요.\",\"INFO_ENG\":\"45\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"방울토마토 소박이\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●오이무침 :\\n오이 70g(1/3개), 다진 땅콩 10g(1큰술)\\n●순두부사과 소스 : \\n순두부 40g(1/8봉지), 사과 50g(1/3개)\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"32\",\"INFO_NA\":\"22\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"4\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"2\",\"HASH_TAG\":\"순두부\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_3.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00032_1.png\",\"MANUAL01\":\"1. 사과, 순두부를 믹서에 넣고 곱게 갈아 소스를 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00032_2.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 오이는 소금으로 문질러 씻어 반을 갈라 씨를 제거하고 어슷썰기를 한다.\",\"MANUAL03\":\"3. 썰어 놓은 오이에 순두부사과 소스를 넣고 버무린 후 다진 땅콩을 뿌려 마무리 한다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00032_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"10\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"사과에는 팩틴이 풍부하여 체내 나쁜 콜레스테롤을 감소시키고 나트륨 배출을 촉진시켜줘요. 순두부와 사과를 갈아 만든 소스는 맵고 짠 자극적인 간이 아닌 재료 그대로의 새콤달콤한 맛과 깔끔한 맛을 내요.\",\"INFO_ENG\":\"75\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"순두부 사과 소스 오이무침\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"북엇국\\n북어채 25g(15개), 새우 10g(3마리), 사과 30g(1/5개), 양파 40g(1/4개),\\n표고버섯 20g(2장), 물 300ml(1½컵)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"33\",\"INFO_NA\":\"78\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"12\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_3.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00033_5.png\",\"MANUAL_IMG01\":\"\",\"MANUAL01\":\"\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00033_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"5. 그릇에 담아낸다.\",\"MANUAL02\":\"2. 북어채를 잘게 손으로 찢어 찬물에 헹구어 준비한 후 양파, 표고버섯, 사과는 채 썰고 새우는 등쪽의 두세 마디에 꼬챙이를 넣어 내장을 뺀 후 헹군다.\",\"MANUAL03\":\"3. 찬물에 북어채, 새우, 표고버섯, 양파를 넣고 20분 정도 끓인 후 사과를 넣어 북어의 씁쓸한 맛을 없앤다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00033_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"2\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"소금과 간장 대신 북어채와 새우의 짠맛으로 간을 한 담백한 맛의 북엇국을 만들었어요. 홍합이나 바지락을 넣으면 시원한 국물을 연출 할 수 있어요.\",\"INFO_ENG\":\"65\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"사과 새우 북엇국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"황태해장국\\n황태(채) 15g(10개), 콩나물 30g(1/6봉지), 무 30g(5×3×2cm), 저염된장 10g(2작은술), 물 300ml(1½컵), 청양고추 5g(1/2개), 다진 마늘 2g(1/3작은술)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"36\",\"INFO_NA\":\"361\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"13\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"0\",\"HASH_TAG\":\"저염된장\",\"MANUAL_IMG02\":\"\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_3.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_4.png\",\"MANUAL_IMG05\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00036_5.png\",\"MANUAL_IMG01\":\"\",\"MANUAL01\":\"\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00036_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"4. 냄비에 물을 붓고 황태와 무를 넣고 끓인 후 육수에서 물을 건져내고 저염 된장을 푼다.\",\"MANUAL05\":\"5. 콩나물, 다진 마늘, 청양고추를 넣고 뚜껑을 덮어 김이 나게 끓\\n여준다.\",\"MANUAL02\":\"\",\"MANUAL03\":\"3. 황태는 손질하여 물에 헹궈 건져 놓고 콩나물은 다듬어 씻고 청양고추는 어슷썰기 한다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00036_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"12\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"황태해장국을 조리할 때 소금 대신 저염된장을 사용하면 덜 짜고 감칠맛 나는 황태해장국을 맛 볼 수 있어요.\\n황태는 빛이 누렇고 살이 연한 것이 좋은 상품이며, 황태는 냉동실에 보관하거나 잘 밀봉하여 건조하고 서늘한 곳에 보관하는 것이 좋아요.\",\"INFO_ENG\":\"100\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"저염 된장으로 맛을 낸 황태해장국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"된장국\\n두부 20g(2×2×2cm), 애느타리버섯 20g(4가닥), 감자 10g(4×3×1cm), 양파 10g(2×1cm), 대파 10g(5cm), 된장 5g(1작은술), 물 300ml(1½컵)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"37\",\"INFO_NA\":\"260\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"0\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_4.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_6.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00037_2.png\",\"MANUAL01\":\"1. 감자, 양파는 얇게 썰고 애느타리 버섯은 썰어 달궈진 팬에 굽는다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00037_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 냄비에 물을 붓고 된장을 푼 뒤 감자, 양파, 두부를 넣어 재료가 투명해지게 끓인 후 된장국의 재료를 건져서 믹서에 넣어 갈고 된장국에 넣어 한번 더 끓인다.\",\"MANUAL03\":\"3. 구운 애느타리버섯과 대파를 국에 넣어 끓인 후 그릇에 담는다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00037_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"3\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"된장국의 된장 사용량을 줄이기 위해 두부와 감자 등의 재료를 갈아 넣으면 담백한 된장국을 맛볼 수 있어요.\\n된장의 양을 적게 사용함으로 나트륨 섭취를 줄일 수 있어요.\",\"INFO_ENG\":\"20\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"된장국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●멸치육수 : 국물용 멸치 5g(3마리), 다시마 1장(5×1cm), 양파 10g(2×1cm), 표고버섯 기둥, 국간장 5g(1작은술), 물 300ml(1½컵)\\n●채소준비 : 청경채 20g(1개), 표고버섯 20g(2장), 다진 마늘 2g(1/3작은술)\",\"RCP_WAY2\":\"끓이기\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"38\",\"INFO_NA\":\"2441\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"2\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"1\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_4.png\",\"RCP_PAT2\":\"국\\u0026찌개\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00038_1.png\",\"MANUAL01\":\"1. 찬물에 표고버섯,머리와 내장을 제거한 멸치,\\n다시마, 양파를 넣어 중간 불에서 10분 정도\\n끓여 멸치육수를 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00038_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 육수의 표고버섯 기둥, 멸치, 다시마, 양파를 건진 후 표고버섯은 편으로 썰고 청경채는 4cm 크기로 썬다.\",\"MANUAL03\":\"3. 끓는 육수에 준비한 표고버섯과 청경채를 넣고 국간장으로 간을 한 후 마늘을 넣어 한소끔 끓인다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00038_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"7\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"표고버섯 밑둥을 육수에 넣어 감칠맛을 더하고, 멸치와 다시마는 다량의 소금 없이도 국물 맛을 깊게 만들어 주는 역할을 해요. 건표고버섯은 햇볕에 말리는 과정에서 만들어진 비타민 D가 풍부해 칼슘 흡수를 도와 골다공증 예방에 좋은 식품이예요. 생표고버섯에는 비타민 D가 거의 들어있지 않아요.\",\"INFO_ENG\":\"45\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"표고버섯 청경채국\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"●치커리 샐러드 : 치커리 30g(10줄기), 적양배추 15g(5×3cm), 양파 10g(2×1cm), 당근 5g(3×1×1cm)\\n●올리브마늘 드레싱 : 올리브유 10g(2작은술), 식초 5g(1작은술), 설탕 5g(1작은술), 마늘 5g(1쪽)\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"95\",\"INFO_NA\":\"74\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"3\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"12\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_3.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_4.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00095_2.png\",\"MANUAL01\":\"1. 올리브유, 식초, 설탕, 다진 마늘을 섞어 거품기로 충분히 저어주어 올리브마늘 드레싱을 만든다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00095_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 치커리는 싱싱하게 찬물에 담갔다가 물기를 뺀 후 한입 크기로 자르고, 적양배추, 양파, 당근은 곱게채를 썬다.\",\"MANUAL03\":\"3. 접시에 준비한 치커리, 적양배추, 양파, 당근을 담고 올리브마늘 드레싱을 뿌린다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00095_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"13\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"치커리를 육류와 함께 섭취하면 치커리의 산뜻한 맛으로 입맛을 돋우고 섬유소의 섭취를 늘릴 수 있으며 동맥경화를 예방하는데 도움이 된답니다. 치커리에는 칼륨이 많아 육류나 고나트륨 식사시 함께 섭취하면 체내나트륨 배출에 효과적이에요.\",\"INFO_ENG\":\"170\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"치커리샐러드와 올리브 마늘 소스\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"},{\"RCP_PARTS_DTLS\":\"스트로베리 샐러드\\n딸기 70g(7개), 플레인요거트 85g(1개), 양상추 70g(2장), 메추리알 30g(3개), 블루베리 15g(1큰술), 식초 약간, 소금 약간\",\"RCP_WAY2\":\"기타\",\"MANUAL_IMG20\":\"\",\"MANUAL20\":\"\",\"RCP_SEQ\":\"87\",\"INFO_NA\":\"138\",\"INFO_WGT\":\"\",\"INFO_PRO\":\"7\",\"MANUAL_IMG13\":\"\",\"MANUAL_IMG14\":\"\",\"MANUAL_IMG15\":\"\",\"MANUAL_IMG16\":\"\",\"MANUAL_IMG10\":\"\",\"MANUAL_IMG11\":\"\",\"MANUAL_IMG12\":\"\",\"MANUAL_IMG17\":\"\",\"MANUAL_IMG18\":\"\",\"MANUAL_IMG19\":\"\",\"INFO_FAT\":\"5\",\"HASH_TAG\":\"\",\"MANUAL_IMG02\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_2.png\",\"MANUAL_IMG03\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_4.png\",\"RCP_PAT2\":\"반찬\",\"MANUAL_IMG04\":\"\",\"MANUAL_IMG05\":\"\",\"MANUAL_IMG01\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/20_00087_1.png\",\"MANUAL01\":\"1. 찬물이 담긴 냄비에 식초, 소금을 넣고 메추리알을 삶는다. 물이 끓어오르면 5분 정도 더 삶아 찬물에 헹군 후 껍질을 벗기고 반으로 자른다.\",\"ATT_FILE_NO_MK\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00087_1.png\",\"MANUAL_IMG06\":\"\",\"MANUAL_IMG07\":\"\",\"MANUAL_IMG08\":\"\",\"MANUAL_IMG09\":\"\",\"MANUAL08\":\"\",\"MANUAL09\":\"\",\"MANUAL06\":\"\",\"MANUAL07\":\"\",\"MANUAL04\":\"\",\"MANUAL05\":\"\",\"MANUAL02\":\"2. 딸기를 흐르는 물에 가볍게 씻어 꼭지를 제거한 후 물기를 빼고 반으로 자른다.\",\"MANUAL03\":\"3. 양상추는 찬물에 담갔다가 물기를 빼고 한입 크기로 찢은 후 접시에 양상추, 딸기, 블루베리, 메추리알을 담고 플레인요거트를 끼얹는다.\",\"ATT_FILE_NO_MAIN\":\"http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00087_2.png\",\"MANUAL11\":\"\",\"MANUAL12\":\"\",\"MANUAL10\":\"\",\"INFO_CAR\":\"30\",\"MANUAL19\":\"\",\"RCP_NA_TIP\":\"딸기는 칼륨이 풍부하여 나트륨 배출에 뛰어나지만 칼슘이 부족한 과일이예요. 그렇기 때문에 칼슘이 풍부한 요거트나 기타 유제품과 함께 섭취하면 좋아요.\",\"INFO_ENG\":\"195\",\"MANUAL17\":\"\",\"MANUAL18\":\"\",\"RCP_NM\":\"스트로베리 샐러드\",\"MANUAL15\":\"\",\"MANUAL16\":\"\",\"MANUAL13\":\"\",\"MANUAL14\":\"\"}]}}";
		
		JSONParser parser = new JSONParser();
		
		JSONObject jsonData;
		try {
			jsonData = (JSONObject) parser.parse(data);
			JSONArray row = (JSONArray) jsonData.get("row");
			System.out.println(row);
			// 필요한 컬럼 RCP_PARTS_DTLS , RCP_NM , RCP_PAT2 , MANUAL01~20
			for (int i = 0; i < row.size(); i++) {
				JSONObject element = (JSONObject) row.get(i);
				ArrayList nameList = new ArrayList();
				nameList.add(element.get("RCP_NM"));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
