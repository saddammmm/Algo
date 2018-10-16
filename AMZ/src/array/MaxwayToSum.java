package array;

import java.text.SimpleDateFormat;
import java.util.Date;



public class MaxwayToSum {

	public static void main(String []args){
		
		
		
		String pass="";
		
		String query ="function mainEnc(){"+
				"var pass='60991273';"+
				"var randomnumber = Math.floor(10000000 + (Math.random() * (100000000 - 10000000 + 1)));"+
				"var l_str_pas = stringToHex(des("+pass+".substring(0, 8), "+pass+", 1, 0));"+
				"var l_sub_password = l_str_pas.toUpperCase().substring(2, l_str_pas.length);"+
				"while (l_sub_password.length < 32) {"+
				"l_sub_password = l_sub_password + '0';"+
				"}"+
				"var pass = hex_hmac(randomnumber, l_sub_password);"+
				"return pass;"+
				"}"+
				""+
				"function string_to_array(str) {"+
				"function string_to_array(str) {"+
				"  var len = str.length;"+
				"  var res = new Array(len);"+
				"  for(var i = 0; i < len; i++)"+
				"    res[i] = str.charCodeAt(i);"+
				"  return res;"+
				"}"+
				""+
				"function array_to_hex_string(ary) {"+
				"  var res = '';"+
				"  for(var i = 0; i < ary.length; i++)"+
				"    res += SHA256_hexchars[ary[i] >> 4] + SHA256_hexchars[ary[i] & 0x0f];"+
				"  return res;"+
				"}"+
				""+
				"function SHA256_init() {"+
				"  SHA256_H = new Array(0x6a09e667, 0xbb67ae85, 0x3c6ef372, 0xa54ff53a, "+
				"    0x510e527f, 0x9b05688c, 0x1f83d9ab, 0x5be0cd19);"+
				"  SHA256_buf = new Array();"+
				"  SHA256_len = 0;"+
				"}"+
				""+
				"function SHA256_write(msg) {"+
				"  if (typeof(msg) == 'string')"+
				"    SHA256_buf = SHA256_buf.concat(string_to_array(msg));"+
				"  else"+
				"    SHA256_buf = SHA256_buf.concat(msg);"+
				"  for(var i = 0; i + 64 <= SHA256_buf.length; i += 64)"+
				"    SHA256_Hash_Byte_Block(SHA256_H, SHA256_buf.slice(i, i + 64));"+
				"  SHA256_buf = SHA256_buf.slice(i);"+
				"  SHA256_len += msg.length;"+
				"}"+
				""+
				"function SHA256_finalize() {"+
				"  SHA256_buf[SHA256_buf.length] = 0x80;"+
				""+
				"  if (SHA256_buf.length > 64 - 8) {"+
				"    for(var i = SHA256_buf.length; i < 64; i++)"+
				"      SHA256_buf[i] = 0;"+
				"    SHA256_Hash_Byte_Block(SHA256_H, SHA256_buf);"+
				"    SHA256_buf.length = 0;"+
				"  }"+
				""+
				"  for(var i = SHA256_buf.length; i < 64 - 5; i++)"+
				"    SHA256_buf[i] = 0;"+
				"  SHA256_buf[59] = (SHA256_len >>> 29) & 0xff;"+
				"  SHA256_buf[60] = (SHA256_len >>> 21) & 0xff;"+
				"  SHA256_buf[61] = (SHA256_len >>> 13) & 0xff;"+
				"  SHA256_buf[62] = (SHA256_len >>> 5) & 0xff;"+
				"  SHA256_buf[63] = (SHA256_len << 3) & 0xff;"+
				"  SHA256_Hash_Byte_Block(SHA256_H, SHA256_buf);"+
				""+
				"  var res = new Array(32);"+
				"  for(var i = 0; i < 8; i++) {"+
				"    res[4 * i + 0] = SHA256_H[i] >>> 24;"+
				"    res[4 * i + 1] = (SHA256_H[i] >> 16) & 0xff;"+
				"    res[4 * i + 2] = (SHA256_H[i] >> 8) & 0xff;"+
				"    res[4 * i + 3] = SHA256_H[i] & 0xff;"+
				"  }"+
				""+
				"  delete SHA256_H;"+
				"  delete SHA256_buf;"+
				"  delete SHA256_len;"+
				"  return res;"+
				"}"+
				""+
				"function SHA256_hash(msg) {"+
				"  var res;"+
				"  SHA256_init();"+
				"  SHA256_write(msg);"+
				"  res = SHA256_finalize();"+
				"  return array_to_hex_string(res);"+
				"}"+
				""+
				"function HMAC_SHA256_init(key) {"+
				"  if (typeof(key) == 'string')"+
				"    HMAC_SHA256_key = string_to_array(key);"+
				"  else"+
				"    HMAC_SHA256_key = new Array().concat(key);"+
				""+
				"  if (HMAC_SHA256_key.length > 64) {"+
				"    SHA256_init();"+
				"    SHA256_write(HMAC_SHA256_key);"+
				"    HMAC_SHA256_key = SHA256_finalize();"+
				"  }"+
				""+
				"  for(var i = HMAC_SHA256_key.length; i < 64; i++)"+
				"    HMAC_SHA256_key[i] = 0;"+
				"  for(var i = 0; i < 64; i++)"+
				"    HMAC_SHA256_key[i] ^=  0x36;"+
				"  SHA256_init();"+
				"  SHA256_write(HMAC_SHA256_key);"+
				"}"+
				""+
				"function HMAC_SHA256_write(msg) {"+
				"  SHA256_write(msg);"+
				"}"+
				""+
				"function HMAC_SHA256_finalize() {"+
				"  var md = SHA256_finalize();"+
				"  for(var i = 0; i < 64; i++)"+
				"    HMAC_SHA256_key[i] ^= 0x36 ^ 0x5c;"+
				"  SHA256_init();"+
				"  SHA256_write(HMAC_SHA256_key);"+
				"  SHA256_write(md);"+
				"  for(var i = 0; i < 64; i++)"+
				"    HMAC_SHA256_key[i] = 0;"+
				"  delete HMAC_SHA256_key;"+
				"  return SHA256_finalize();"+
				"}"+
				""+
				"function HMAC_SHA256_MAC(key, msg) {"+
				"  var res;"+
				"  HMAC_SHA256_init(key);"+
				"  HMAC_SHA256_write(msg);"+
				"  res = HMAC_SHA256_finalize()"+
				"  return array_to_hex_string(res);"+
				"}"+
				""+
				"SHA256_hexchars = new Array('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', "+
				"  'a', 'b', 'c', 'd', 'e', 'f');"+
				""+
				"SHA256_K = new Array("+
				"  0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, "+
				"  0x923f82a4, 0xab1c5ed5, 0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3, "+
				"  0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174, 0xe49b69c1, 0xefbe4786, "+
				"  0x0fc19dc6, 0x240ca1cc, 0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da, "+
				"  0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, "+
				"  0x06ca6351, 0x14292967, 0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, "+
				"  0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85, 0xa2bfe8a1, 0xa81a664b, "+
				"  0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070, "+
				"  0x19a4c116, 0x1e376c08, 0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, "+
				"  0x5b9cca4f, 0x682e6ff3, 0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, "+
				"  0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2 "+
				");"+
				""+
				"function SHA256_sigma0(x) {"+
				"  return ((x >>> 7) | (x << 25)) ^ ((x >>> 18) | (x << 14)) ^ (x >>> 3);"+
				"}"+
				""+
				"function SHA256_sigma1(x) {"+
				"  return ((x >>> 17) | (x << 15)) ^ ((x >>> 19) | (x << 13)) ^ (x >>> 10);"+
				"}"+
				""+
				"function SHA256_Sigma0(x) {"+
				"  return ((x >>> 2) | (x << 30)) ^ ((x >>> 13) | (x << 19)) ^ "+
				"    ((x >>> 22) | (x << 10));"+
				"}"+
				""+
				"function SHA256_Sigma1(x) {"+
				"  return ((x >>> 6) | (x << 26)) ^ ((x >>> 11) | (x << 21)) ^ "+
				"    ((x >>> 25) | (x << 7));"+
				"}"+
				""+
				"function SHA256_Ch(x, y, z) {"+
				"  return z ^ (x & (y ^ z));"+
				"}"+
				""+
				"function SHA256_Maj(x, y, z) {"+
				"  return (x & y) ^ (z & (x ^ y));"+
				"}"+
				""+
				"function SHA256_Hash_Word_Block(H, W) {"+
				"  for(var i = 16; i < 64; i++)"+
				"    W[i] = (SHA256_sigma1(W[i - 2]) +  W[i - 7] + "+
				"      SHA256_sigma0(W[i - 15]) + W[i - 16]) & 0xffffffff;"+
				"  var state = new Array().concat(H);"+
				"  for(var i = 0; i < 64; i++) {"+
				"    var T1 = state[7] + SHA256_Sigma1(state[4]) + "+
				"      SHA256_Ch(state[4], state[5], state[6]) + SHA256_K[i] + W[i];"+
				"    var T2 = SHA256_Sigma0(state[0]) + SHA256_Maj(state[0], state[1], state[2]);"+
				"    state.pop();"+
				"    state.unshift((T1 + T2) & 0xffffffff);"+
				"    state[4] = (state[4] + T1) & 0xffffffff;"+
				"  }"+
				"  for(var i = 0; i < 8; i++)"+
				"    H[i] = (H[i] + state[i]) & 0xffffffff;"+
				"}"+
				""+
				"function SHA256_Hash_Byte_Block(H, w) {"+
				"  var W = new Array(16);"+
				"  for(var i = 0; i < 16; i++)"+
				"    W[i] = w[4 * i + 0] << 24 | w[4 * i + 1] << 16 | "+
				"      w[4 * i + 2] << 8 | w[4 * i + 3];"+
				"  SHA256_Hash_Word_Block(H, W);"+
				"}"+
				" function hex_hmac(key, data)"+
				" {"+
				""+
				" }"+
				" "+
				" function stringToHex (s) {"+
				"  var r = '0x';"+
				"  var hexes = new Array ('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f');"+
				"  for (var i=0; i<s.length; i++) {r += hexes [s.charCodeAt(i) >> 4] + hexes [s.charCodeAt(i) & 0xf];}"+
				"  return r;"+
				"} "+
				""+
				""+
				"function des (key, message, encrypt, mode, iv, padding) {"+
				"  //declaring this locally speeds things up a bit"+
				"  var spfunction1 = new Array (0x1010400,0,0x10000,0x1010404,0x1010004,0x10404,0x4,0x10000,0x400,0x1010400,0x1010404,0x400,0x1000404,0x1010004,0x1000000,0x4,0x404,0x1000400,0x1000400,0x10400,0x10400,0x1010000,0x1010000,0x1000404,0x10004,0x1000004,0x1000004,0x10004,0,0x404,0x10404,0x1000000,0x10000,0x1010404,0x4,0x1010000,0x1010400,0x1000000,0x1000000,0x400,0x1010004,0x10000,0x10400,0x1000004,0x400,0x4,0x1000404,0x10404,0x1010404,0x10004,0x1010000,0x1000404,0x1000004,0x404,0x10404,0x1010400,0x404,0x1000400,0x1000400,0,0x10004,0x10400,0,0x1010004);"+
				"  var spfunction2 = new Array (-0x7fef7fe0,-0x7fff8000,0x8000,0x108020,0x100000,0x20,-0x7fefffe0,-0x7fff7fe0,-0x7fffffe0,-0x7fef7fe0,-0x7fef8000,-0x80000000,-0x7fff8000,0x100000,0x20,-0x7fefffe0,0x108000,0x100020,-0x7fff7fe0,0,-0x80000000,0x8000,0x108020,-0x7ff00000,0x100020,-0x7fffffe0,0,0x108000,0x8020,-0x7fef8000,-0x7ff00000,0x8020,0,0x108020,-0x7fefffe0,0x100000,-0x7fff7fe0,-0x7ff00000,-0x7fef8000,0x8000,-0x7ff00000,-0x7fff8000,0x20,-0x7fef7fe0,0x108020,0x20,0x8000,-0x80000000,0x8020,-0x7fef8000,0x100000,-0x7fffffe0,0x100020,-0x7fff7fe0,-0x7fffffe0,0x100020,0x108000,0,-0x7fff8000,0x8020,-0x80000000,-0x7fefffe0,-0x7fef7fe0,0x108000);"+
				"  var spfunction3 = new Array (0x208,0x8020200,0,0x8020008,0x8000200,0,0x20208,0x8000200,0x20008,0x8000008,0x8000008,0x20000,0x8020208,0x20008,0x8020000,0x208,0x8000000,0x8,0x8020200,0x200,0x20200,0x8020000,0x8020008,0x20208,0x8000208,0x20200,0x20000,0x8000208,0x8,0x8020208,0x200,0x8000000,0x8020200,0x8000000,0x20008,0x208,0x20000,0x8020200,0x8000200,0,0x200,0x20008,0x8020208,0x8000200,0x8000008,0x200,0,0x8020008,0x8000208,0x20000,0x8000000,0x8020208,0x8,0x20208,0x20200,0x8000008,0x8020000,0x8000208,0x208,0x8020000,0x20208,0x8,0x8020008,0x20200);"+
				"  var spfunction4 = new Array (0x802001,0x2081,0x2081,0x80,0x802080,0x800081,0x800001,0x2001,0,0x802000,0x802000,0x802081,0x81,0,0x800080,0x800001,0x1,0x2000,0x800000,0x802001,0x80,0x800000,0x2001,0x2080,0x800081,0x1,0x2080,0x800080,0x2000,0x802080,0x802081,0x81,0x800080,0x800001,0x802000,0x802081,0x81,0,0,0x802000,0x2080,0x800080,0x800081,0x1,0x802001,0x2081,0x2081,0x80,0x802081,0x81,0x1,0x2000,0x800001,0x2001,0x802080,0x800081,0x2001,0x2080,0x800000,0x802001,0x80,0x800000,0x2000,0x802080);"+
				"  var spfunction5 = new Array (0x100,0x2080100,0x2080000,0x42000100,0x80000,0x100,0x40000000,0x2080000,0x40080100,0x80000,0x2000100,0x40080100,0x42000100,0x42080000,0x80100,0x40000000,0x2000000,0x40080000,0x40080000,0,0x40000100,0x42080100,0x42080100,0x2000100,0x42080000,0x40000100,0,0x42000000,0x2080100,0x2000000,0x42000000,0x80100,0x80000,0x42000100,0x100,0x2000000,0x40000000,0x2080000,0x42000100,0x40080100,0x2000100,0x40000000,0x42080000,0x2080100,0x40080100,0x100,0x2000000,0x42080000,0x42080100,0x80100,0x42000000,0x42080100,0x2080000,0,0x40080000,0x42000000,0x80100,0x2000100,0x40000100,0x80000,0,0x40080000,0x2080100,0x40000100);"+
				"  var spfunction6 = new Array (0x20000010,0x20400000,0x4000,0x20404010,0x20400000,0x10,0x20404010,0x400000,0x20004000,0x404010,0x400000,0x20000010,0x400010,0x20004000,0x20000000,0x4010,0,0x400010,0x20004010,0x4000,0x404000,0x20004010,0x10,0x20400010,0x20400010,0,0x404010,0x20404000,0x4010,0x404000,0x20404000,0x20000000,0x20004000,0x10,0x20400010,0x404000,0x20404010,0x400000,0x4010,0x20000010,0x400000,0x20004000,0x20000000,0x4010,0x20000010,0x20404010,0x404000,0x20400000,0x404010,0x20404000,0,0x20400010,0x10,0x4000,0x20400000,0x404010,0x4000,0x400010,0x20004010,0,0x20404000,0x20000000,0x400010,0x20004010);"+
				"  var spfunction7 = new Array (0x200000,0x4200002,0x4000802,0,0x800,0x4000802,0x200802,0x4200800,0x4200802,0x200000,0,0x4000002,0x2,0x4000000,0x4200002,0x802,0x4000800,0x200802,0x200002,0x4000800,0x4000002,0x4200000,0x4200800,0x200002,0x4200000,0x800,0x802,0x4200802,0x200800,0x2,0x4000000,0x200800,0x4000000,0x200800,0x200000,0x4000802,0x4000802,0x4200002,0x4200002,0x2,0x200002,0x4000000,0x4000800,0x200000,0x4200800,0x802,0x200802,0x4200800,0x802,0x4000002,0x4200802,0x4200000,0x200800,0,0x2,0x4200802,0,0x200802,0x4200000,0x800,0x4000002,0x4000800,0x800,0x200002);"+
				"  var spfunction8 = new Array (0x10001040,0x1000,0x40000,0x10041040,0x10000000,0x10001040,0x40,0x10000000,0x40040,0x10040000,0x10041040,0x41000,0x10041000,0x41040,0x1000,0x40,0x10040000,0x10000040,0x10001000,0x1040,0x41000,0x40040,0x10040040,0x10041000,0x1040,0,0,0x10040040,0x10000040,0x10001000,0x41040,0x40000,0x41040,0x40000,0x10041000,0x1000,0x40,0x10040040,0x1000,0x41040,0x10001000,0x40,0x10000040,0x10040000,0x10040040,0x10000000,0x40000,0x10001040,0,0x10041040,0x40040,0x10000040,0x10040000,0x10001000,0x10001040,0,0x10041040,0x41000,0x41000,0x1040,0x1040,0x40040,0x10000000,0x10041000);"+
				""+
				"  //create the 16 or 48 subkeys we will need"+
				"  var keys = des_createKeys (key);"+
				"  var m=0, i, j, temp, temp2, right1, right2, left, right, looping;"+
				"  var cbcleft, cbcleft2, cbcright, cbcright2"+
				"  var endloop, loopinc;"+
				"  var len = message.length;"+
				"  var chunk = 0;"+
				"  //set up the loops for single and triple des"+
				"  var iterations = keys.length == 32 ? 3 : 9; //single or triple des"+
				"  if (iterations == 3) {looping = encrypt ? new Array (0, 32, 2) : new Array (30, -2, -2);}"+
				"  else {looping = encrypt ? new Array (0, 32, 2, 62, 30, -2, 64, 96, 2) : new Array (94, 62, -2, 32, 64, 2, 30, -2, -2);}"+
				""+
				"  //pad the message depending on the padding parameter"+
				"  if (padding == 2) message += '        '; //pad the message with spaces"+
				"  else if (padding == 1) {temp = 8-(len%8); message += String.fromCharCode (temp,temp,temp,temp,temp,temp,temp,temp); if (temp==8) len+=8;} //PKCS7 padding"+
				"  else if (!padding) message += '\0\0\0\0\0\0\0\0'; //pad the message out with null bytes"+
				""+
				"  //store the result here"+
				"  result = '';"+
				"  tempresult = '';"+
				""+
				"  if (mode == 1) { //CBC mode"+
				"    cbcleft = (iv.charCodeAt(m++) << 24) | (iv.charCodeAt(m++) << 16) | (iv.charCodeAt(m++) << 8) | iv.charCodeAt(m++);"+
				"    cbcright = (iv.charCodeAt(m++) << 24) | (iv.charCodeAt(m++) << 16) | (iv.charCodeAt(m++) << 8) | iv.charCodeAt(m++);"+
				"    m=0;"+
				"  }"+
				""+
				"  //loop through each 64 bit chunk of the message"+
				"  while (m < len) {"+
				"    left = (message.charCodeAt(m++) << 24) | (message.charCodeAt(m++) << 16) | (message.charCodeAt(m++) << 8) | message.charCodeAt(m++);"+
				"    right = (message.charCodeAt(m++) << 24) | (message.charCodeAt(m++) << 16) | (message.charCodeAt(m++) << 8) | message.charCodeAt(m++);"+
				""+
				"    //for Cipher Block Chaining mode, xor the message with the previous result"+
				"    if (mode == 1) {if (encrypt) {left ^= cbcleft; right ^= cbcright;} else {cbcleft2 = cbcleft; cbcright2 = cbcright; cbcleft = left; cbcright = right;}}"+
				""+
				"    //first each 64 but chunk of the message must be permuted according to IP"+
				"    temp = ((left >>> 4) ^ right) & 0x0f0f0f0f; right ^= temp; left ^= (temp << 4);"+
				"    temp = ((left >>> 16) ^ right) & 0x0000ffff; right ^= temp; left ^= (temp << 16);"+
				"    temp = ((right >>> 2) ^ left) & 0x33333333; left ^= temp; right ^= (temp << 2);"+
				"    temp = ((right >>> 8) ^ left) & 0x00ff00ff; left ^= temp; right ^= (temp << 8);"+
				"    temp = ((left >>> 1) ^ right) & 0x55555555; right ^= temp; left ^= (temp << 1);"+
				""+
				"    left = ((left << 1) | (left >>> 31)); "+
				"    right = ((right << 1) | (right >>> 31)); "+
				""+
				"    //do this either 1 or 3 times for each chunk of the message"+
				"    for (j=0; j<iterations; j+=3) {"+
				"      endloop = looping[j+1];"+
				"      loopinc = looping[j+2];"+
				"      //now go through and perform the encryption or decryption  "+
				"      for (i=looping[j]; i!=endloop; i+=loopinc) { //for efficiency"+
				"        right1 = right ^ keys[i]; "+
				"        right2 = ((right >>> 4) | (right << 28)) ^ keys[i+1];"+
				"        //the result is attained by passing these bytes through the S selection functions"+
				"        temp = left;"+
				"        left = right;"+
				"        right = temp ^ (spfunction2[(right1 >>> 24) & 0x3f] | spfunction4[(right1 >>> 16) & 0x3f]"+
				"              | spfunction6[(right1 >>>  8) & 0x3f] | spfunction8[right1 & 0x3f]"+
				"              | spfunction1[(right2 >>> 24) & 0x3f] | spfunction3[(right2 >>> 16) & 0x3f]"+
				"              | spfunction5[(right2 >>>  8) & 0x3f] | spfunction7[right2 & 0x3f]);"+
				"      }"+
				"      temp = left; left = right; right = temp; //unreverse left and right"+
				"    } //for either 1 or 3 iterations"+
				""+
				"    //move then each one bit to the right"+
				"    left = ((left >>> 1) | (left << 31)); "+
				"    right = ((right >>> 1) | (right << 31)); "+
				""+
				"    //now perform IP-1, which is IP in the opposite direction"+
				"    temp = ((left >>> 1) ^ right) & 0x55555555; right ^= temp; left ^= (temp << 1);"+
				"    temp = ((right >>> 8) ^ left) & 0x00ff00ff; left ^= temp; right ^= (temp << 8);"+
				"    temp = ((right >>> 2) ^ left) & 0x33333333; left ^= temp; right ^= (temp << 2);"+
				"    temp = ((left >>> 16) ^ right) & 0x0000ffff; right ^= temp; left ^= (temp << 16);"+
				"    temp = ((left >>> 4) ^ right) & 0x0f0f0f0f; right ^= temp; left ^= (temp << 4);"+
				""+
				"    //for Cipher Block Chaining mode, xor the message with the previous result"+
				"    if (mode == 1) {if (encrypt) {cbcleft = left; cbcright = right;} else {left ^= cbcleft2; right ^= cbcright2;}}"+
				"    tempresult += String.fromCharCode ((left>>>24), ((left>>>16) & 0xff), ((left>>>8) & 0xff), (left & 0xff), (right>>>24), ((right>>>16) & 0xff), ((right>>>8) & 0xff), (right & 0xff));"+
				""+
				"    chunk += 8;"+
				"    if (chunk == 512) {result += tempresult; tempresult = ''; chunk = 0;}"+
				"  } //for every 8 characters, or 64 bits in the message"+
				""+
				"  //return the result as an array"+
				"  return result + tempresult;"+
				"} //end of des"+
				""+
				""+
				""+
				"//des_createKeys"+
				"//this takes as input a 64 bit key (even though only 56 bits are used)"+
				"//as an array of 2 integers, and returns 16 48 bit keys"+
				"function des_createKeys (key) {"+
				"  //declaring this locally speeds things up a bit"+
				"  pc2bytes0  = new Array (0,0x4,0x20000000,0x20000004,0x10000,0x10004,0x20010000,0x20010004,0x200,0x204,0x20000200,0x20000204,0x10200,0x10204,0x20010200,0x20010204);"+
				"  pc2bytes1  = new Array (0,0x1,0x100000,0x100001,0x4000000,0x4000001,0x4100000,0x4100001,0x100,0x101,0x100100,0x100101,0x4000100,0x4000101,0x4100100,0x4100101);"+
				"  pc2bytes2  = new Array (0,0x8,0x800,0x808,0x1000000,0x1000008,0x1000800,0x1000808,0,0x8,0x800,0x808,0x1000000,0x1000008,0x1000800,0x1000808);"+
				"  pc2bytes3  = new Array (0,0x200000,0x8000000,0x8200000,0x2000,0x202000,0x8002000,0x8202000,0x20000,0x220000,0x8020000,0x8220000,0x22000,0x222000,0x8022000,0x8222000);"+
				"  pc2bytes4  = new Array (0,0x40000,0x10,0x40010,0,0x40000,0x10,0x40010,0x1000,0x41000,0x1010,0x41010,0x1000,0x41000,0x1010,0x41010);"+
				"  pc2bytes5  = new Array (0,0x400,0x20,0x420,0,0x400,0x20,0x420,0x2000000,0x2000400,0x2000020,0x2000420,0x2000000,0x2000400,0x2000020,0x2000420);"+
				"  pc2bytes6  = new Array (0,0x10000000,0x80000,0x10080000,0x2,0x10000002,0x80002,0x10080002,0,0x10000000,0x80000,0x10080000,0x2,0x10000002,0x80002,0x10080002);"+
				"  pc2bytes7  = new Array (0,0x10000,0x800,0x10800,0x20000000,0x20010000,0x20000800,0x20010800,0x20000,0x30000,0x20800,0x30800,0x20020000,0x20030000,0x20020800,0x20030800);"+
				"  pc2bytes8  = new Array (0,0x40000,0,0x40000,0x2,0x40002,0x2,0x40002,0x2000000,0x2040000,0x2000000,0x2040000,0x2000002,0x2040002,0x2000002,0x2040002);"+
				"  pc2bytes9  = new Array (0,0x10000000,0x8,0x10000008,0,0x10000000,0x8,0x10000008,0x400,0x10000400,0x408,0x10000408,0x400,0x10000400,0x408,0x10000408);"+
				"  pc2bytes10 = new Array (0,0x20,0,0x20,0x100000,0x100020,0x100000,0x100020,0x2000,0x2020,0x2000,0x2020,0x102000,0x102020,0x102000,0x102020);"+
				"  pc2bytes11 = new Array (0,0x1000000,0x200,0x1000200,0x200000,0x1200000,0x200200,0x1200200,0x4000000,0x5000000,0x4000200,0x5000200,0x4200000,0x5200000,0x4200200,0x5200200);"+
				"  pc2bytes12 = new Array (0,0x1000,0x8000000,0x8001000,0x80000,0x81000,0x8080000,0x8081000,0x10,0x1010,0x8000010,0x8001010,0x80010,0x81010,0x8080010,0x8081010);"+
				"  pc2bytes13 = new Array (0,0x4,0x100,0x104,0,0x4,0x100,0x104,0x1,0x5,0x101,0x105,0x1,0x5,0x101,0x105);"+
				""+
				"  //how many iterations (1 for des, 3 for triple des)"+
				"  var iterations = key.length > 8 ? 3 : 1; //changed by Paul 16/6/2007 to use Triple DES for 9+ byte keys"+
				"  //stores the return keys"+
				"  var keys = new Array (32 * iterations);"+
				"  //now define the left shifts which need to be done"+
				"  var shifts = new Array (0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0);"+
				"  //other variables"+
				"  var lefttemp, righttemp, m=0, n=0, temp;"+
				""+
				"  for (var j=0; j<iterations; j++) { //either 1 or 3 iterations"+
				"    left = (key.charCodeAt(m++) << 24) | (key.charCodeAt(m++) << 16) | (key.charCodeAt(m++) << 8) | key.charCodeAt(m++);"+
				"    right = (key.charCodeAt(m++) << 24) | (key.charCodeAt(m++) << 16) | (key.charCodeAt(m++) << 8) | key.charCodeAt(m++);"+
				""+
				"    temp = ((left >>> 4) ^ right) & 0x0f0f0f0f; right ^= temp; left ^= (temp << 4);"+
				"    temp = ((right >>> -16) ^ left) & 0x0000ffff; left ^= temp; right ^= (temp << -16);"+
				"    temp = ((left >>> 2) ^ right) & 0x33333333; right ^= temp; left ^= (temp << 2);"+
				"    temp = ((right >>> -16) ^ left) & 0x0000ffff; left ^= temp; right ^= (temp << -16);"+
				"    temp = ((left >>> 1) ^ right) & 0x55555555; right ^= temp; left ^= (temp << 1);"+
				"    temp = ((right >>> 8) ^ left) & 0x00ff00ff; left ^= temp; right ^= (temp << 8);"+
				"    temp = ((left >>> 1) ^ right) & 0x55555555; right ^= temp; left ^= (temp << 1);"+
				""+
				"    //the right side needs to be shifted and to get the last four bits of the left side"+
				"    temp = (left << 8) | ((right >>> 20) & 0x000000f0);"+
				"    //left needs to be put upside down"+
				"    left = (right << 24) | ((right << 8) & 0xff0000) | ((right >>> 8) & 0xff00) | ((right >>> 24) & 0xf0);"+
				"    right = temp;"+
				""+
				"    //now go through and perform these shifts on the left and right keys"+
				"    for (var i=0; i < shifts.length; i++) {"+
				"      //shift the keys either one or two bits to the left"+
				"      if (shifts[i]) {left = (left << 2) | (left >>> 26); right = (right << 2) | (right >>> 26);}"+
				"      else {left = (left << 1) | (left >>> 27); right = (right << 1) | (right >>> 27);}"+
				"      left &= -0xf; right &= -0xf;"+
				""+
				"      //now apply PC-2, in such a way that E is easier when encrypting or decrypting"+
				"      //this conversion will look like PC-2 except only the last 6 bits of each byte are used"+
				"      //rather than 48 consecutive bits and the order of lines will be according to "+
				"      //how the S selection functions will be applied: S2, S4, S6, S8, S1, S3, S5, S7"+
				"      lefttemp = pc2bytes0[left >>> 28] | pc2bytes1[(left >>> 24) & 0xf]"+
				"              | pc2bytes2[(left >>> 20) & 0xf] | pc2bytes3[(left >>> 16) & 0xf]"+
				"              | pc2bytes4[(left >>> 12) & 0xf] | pc2bytes5[(left >>> 8) & 0xf]"+
				"              | pc2bytes6[(left >>> 4) & 0xf];"+
				"      righttemp = pc2bytes7[right >>> 28] | pc2bytes8[(right >>> 24) & 0xf]"+
				"                | pc2bytes9[(right >>> 20) & 0xf] | pc2bytes10[(right >>> 16) & 0xf]"+
				"                | pc2bytes11[(right >>> 12) & 0xf] | pc2bytes12[(right >>> 8) & 0xf]"+
				"                | pc2bytes13[(right >>> 4) & 0xf];"+
				"      temp = ((righttemp >>> 16) ^ lefttemp) & 0x0000ffff; "+
				"      keys[n++] = lefttemp ^ temp; keys[n++] = righttemp ^ (temp << 16);"+
				"    }"+
				"  } //for each iterations"+
				"  //return the keys we've created"+
				"  return keys;"+
				"} //end of des_createKeys"+
				"function stringToHex (s) {"+
				"  var r = '0x';"+
				"  var hexes = new Array ('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f');"+
				"  for (var i=0; i<s.length; i++) {r += hexes [s.charCodeAt(i) >> 4] + hexes [s.charCodeAt(i) & 0xf];}"+
				"  return r;"+
				"}"+
				""+
				"function hexToString (h) {"+
				"  var r = '';"+
				"  for (var i= (h.substr(0, 2)=='0x')?2:0; i<h.length; i+=2) {r += String.fromCharCode (parseInt (h.substr (i, 2), 16));}"+
				"  return r;"+
				"}";

		
		
		
		
		
	}
	
	 static int countConsecutive(long N) 
	    { 
	        // constraint on values of L gives us the  
	        // time Complexity as O(N^0.5) 
	        int count = 0; 
	        for (long L = 1; L * (L + 1) < 2 * N; L++) 
	        { 
	            float a = (float) ((1.0 * N-(L * (L + 1)) / 2) / (L + 1)); 
	            if (a-(int)a == 0.0)  
	                count++;         
	        } 
	        return count; 
	    } 
	
}
