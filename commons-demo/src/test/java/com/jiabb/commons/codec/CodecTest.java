package com.jiabb.commons.codec;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.language.Metaphone;
import org.apache.commons.codec.language.RefinedSoundex;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.net.URLCodec;

import java.nio.charset.StandardCharsets;

@Slf4j
public class CodecTest extends TestCase {

	String source = "AAaaa测111";

	public void testBase64() {
		Base64 base64 = new Base64();
		//编码
		String encode = base64.encodeToString(source.getBytes(StandardCharsets.UTF_8));
		log.info("base64 编码结果 -> {}", encode);
		//解码
		byte[] decode = base64.decode(encode);
		log.info("base64 解码结果 -> {}", new String(decode, StandardCharsets.UTF_8));
	}

	public void testHex() throws DecoderException {
		//编码  第二个字段是否转小写 Hex.encodeHex() 参数同encodeHexString
		String hexEncode = Hex.encodeHexString(source.getBytes(StandardCharsets.UTF_8), false);
		log.info("hex 编码结果 -> {}", hexEncode);

		//解码
		byte[] bytes = Hex.decodeHex(hexEncode);
		log.info("hex 解码结果 -> {}", new String(bytes, StandardCharsets.UTF_8));
	}

	public void testMd5() {
		//编码
		byte[] bytes = DigestUtils.md5(source.getBytes(StandardCharsets.UTF_8));
		log.info("md5 编码结果 -> {}", new String(bytes, StandardCharsets.UTF_8));
		String md5Encode = DigestUtils.md5Hex(source.getBytes(StandardCharsets.UTF_8));
		log.info("md5Hex 编码结果 -> {}", md5Encode);
	}

	public void testSha(){
		//编码
		String sha = DigestUtils.sha1Hex(source);
		log.info("sha1Hex 编码结果 -> {}", sha);

	}

	public void testURLCodec() throws EncoderException, DecoderException {
		String url = "http://baidu.com?name=你好";
		URLCodec codec = new URLCodec();
		String encode = codec.encode(url);
		log.info("encode 编码结果 -> {}", encode);
		String decodes = codec.decode(encode);
		log.info("decodes 解码结果 -> {}", decodes);
	}

	/**
	 * Metaphone 建立出相同的key给发音相似的单字, 比 Soundex 还要准确,
	 * 但是 Metaphone 没有固定长度, Soundex 则是固定第一个英文字加上3个数字.
	 * 这通常是用在类似音比对, 也可以用在 MP3 的软件开发
	 */
	public void testMetaphoneAndSoundex(){
		String str = "testgggggg";
		/**Metaphone没有固定长度*/
		Metaphone metaphone = new Metaphone();
		String metaphoneEncode = metaphone.encode(str);
		log.info("metaphoneEncode -> {}", metaphoneEncode);
		/**RefinedSoundex*/
		RefinedSoundex refinedSoundex = new RefinedSoundex();
		String refinedSoundexEncode = refinedSoundex.encode(str);
		log.info("refinedSoundex -> {}", refinedSoundexEncode);
		/**Soundex固定第一个英文字加上3个数字*/
		Soundex soundex = new Soundex();
		String soundexEncode = soundex.encode(str);
		log.info("soundex -> {}", soundexEncode);
	}

}
