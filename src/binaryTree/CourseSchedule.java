package binaryTree;

import java.util.*;

public class CourseSchedule {
    public static void main(String[] args) {
        CourseSchedule obj = new CourseSchedule();
        int[][] matr = {{781,650},{650,1175},{1175,1961},{1961,1414},{1414,1144},{1144,461},{461,1450},{1450,1836},{1836,754},{754,1429},{1429,97},{97,385},{385,1260},{1260,1345},{1345,1751},{1751,1775},{1775,1273},{1273,18},{18,1307},{1307,859},{859,1792},{1792,1258},{1258,1609},{1609,999},{999,1485},{1485,887},{887,82},{82,285},{285,1026},{1026,1442},{1442,328},{328,224},{224,33},{33,1687},{1687,1797},{1797,510},{510,1266},{1266,1984},{1984,314},{314,1314},{1314,67},{67,375},{375,1969},{1969,560},{560,1466},{1466,1362},{1362,1672},{1672,1657},{1657,1323},{1323,114},{114,745},{745,1455},{1455,1306},{1306,241},{241,960},{960,271},{271,57},{57,324},{324,400},{400,609},{609,721},{721,1387},{1387,793},{793,482},{482,873},{873,311},{311,833},{833,637},{637,491},{491,886},{886,1426},{1426,201},{201,1740},{1740,183},{183,1706},{1706,626},{626,546},{546,318},{318,903},{903,1979},{1979,69},{69,472},{472,16},{16,576},{576,1370},{1370,1691},{1691,665},{665,256},{256,1884},{1884,548},{548,28},{28,176},{176,252},{252,1105},{1105,274},{274,1721},{1721,1718},{1718,906},{906,852},{852,1435},{1435,865},{865,896},{896,699},{699,1156},{1156,259},{259,1399},{1399,740},{740,673},{673,622},{622,984},{984,794},{794,963},{963,1753},{1753,1454},{1454,1017},{1017,1636},{1636,627},{627,1498},{1498,1628},{1628,628},{628,513},{513,1044},{1044,1564},{1564,933},{933,653},{653,1401},{1401,909},{909,1768},{1768,840},{840,1749},{1749,554},{554,1326},{1326,1931},{1931,844},{844,645},{645,1592},{1592,1183},{1183,306},{306,1949},{1949,1970},{1970,1680},{1680,27},{27,1329},{1329,277},{277,354},{354,612},{612,1844},{1844,1389},{1389,550},{550,1291},{1291,1524},{1524,686},{686,688},{688,1845},{1845,448},{448,730},{730,1603},{1603,185},{185,109},{109,591},{591,1159},{1159,1919},{1919,380},{380,719},{719,728},{728,1873},{1873,1093},{1093,969},{969,1798},{1798,1413},{1413,492},{492,365},{365,1988},{1988,695},{695,14},{14,773},{773,177},{177,1720},{1720,1964},{1964,1432},{1432,1187},{1187,1479},{1479,784},{784,118},{118,741},{741,967},{967,1641},{1641,490},{490,966},{966,1591},{1591,1778},{1778,1576},{1576,1615},{1615,723},{723,1724},{1724,1954},{1954,1709},{1709,96},{96,1486},{1486,1642},{1642,1776},{1776,994},{994,1758},{1758,1983},{1983,483},{483,917},{917,738},{738,1428},{1428,1852},{1852,1648},{1648,1953},{1953,155},{155,181},{181,815},{815,1180},{1180,1666},{1666,88},{88,1226},{1226,876},{876,1179},{1179,251},{251,720},{720,1073},{1073,1042},{1042,1599},{1599,102},{102,372},{372,466},{466,636},{636,1892},{1892,620},{620,164},{164,866},{866,1646},{1646,1253},{1253,467},{467,1342},{1342,1584},{1584,540},{540,1104},{1104,543},{543,1677},{1677,529},{529,1705},{1705,429},{429,1606},{1606,1202},{1202,1886},{1886,508},{508,883},{883,694},{694,1542},{1542,1774},{1774,371},{371,1586},{1586,414},{414,1877},{1877,1398},{1398,1182},{1182,644},{644,809},{809,890},{890,1035},{1035,390},{390,1671},{1671,970},{970,756},{756,1267},{1267,1332},{1332,158},{158,1587},{1587,1940},{1940,475},{475,478},{478,1206},{1206,590},{590,1731},{1731,573},{573,392},{392,1728},{1728,281},{281,1834},{1834,404},{404,1471},{1471,615},{615,1109},{1109,621},{621,1861},{1861,925},{925,1874},{1874,1882},{1882,1013},{1013,1367},{1367,1660},{1660,1380},{1380,243},{243,722},{722,668},{668,1526},{1526,1855},{1855,1118},{1118,1243},{1243,128},{128,1842},{1842,1178},{1178,1472},{1472,370},{370,1437},{1437,1274},{1274,434},{434,1782},{1782,511},{511,402},{402,1982},{1982,1875},{1875,703},{703,1131},{1131,1085},{1085,1034},{1034,1181},{1181,1467},{1467,556},{556,139},{139,298},{298,1440},{1440,1298},{1298,1899},{1899,1978},{1978,1217},{1217,1951},{1951,1683},{1683,1280},{1280,1204},{1204,405},{405,99},{99,1448},{1448,162},{162,1112},{1112,1157},{1157,1929},{1929,1890},{1890,1926},{1926,1302},{1302,1425},{1425,1699},{1699,565},{565,1627},{1627,1483},{1483,1676},{1676,66},{66,1116},{1116,986},{986,1041},{1041,62},{62,1818},{1818,1888},{1888,355},{355,266},{266,431},{431,1218},{1218,1763},{1763,115},{115,997},{997,1099},{1099,936},{936,249},{249,1704},{1704,930},{930,1560},{1560,1230},{1230,646},{646,144},{144,1059},{1059,1506},{1506,791},{791,811},{811,1427},{1427,595},{595,413},{413,1800},{1800,399},{399,299},{299,1902},{1902,1679},{1679,1871},{1871,87},{87,1914},{1914,260},{260,361},{361,1726},{1726,1880},{1880,200},{200,1225},{1225,1772},{1772,1608},{1608,1866},{1866,1346},{1346,538},{538,669},{669,1000},{1000,1190},{1190,330},{330,1434},{1434,1896},{1896,117},{117,1779},{1779,836},{836,1692},{1692,1386},{1386,417},{417,596},{596,1993},{1993,422},{422,1248},{1248,928},{928,253},{253,1012},{1012,457},{457,1991},{1991,1412},{1412,1801},{1801,1127},{1127,1331},{1331,1920},{1920,1945},{1945,671},{671,1837},{1837,317},{317,301},{301,335},{335,1674},{1674,1121},{1121,1921},{1921,1198},{1198,411},{411,1152},{1152,1277},{1277,1912},{1912,586},{586,310},{310,1525},{1525,1174},{1174,1254},{1254,284},{284,1103},{1103,1350},{1350,1396},{1396,835},{835,1509},{1509,1275},{1275,127},{127,206},{206,188},{188,1960},{1960,980},{980,1122},{1122,77},{77,31},{31,652},{652,1507},{1507,386},{386,655},{655,129},{129,1215},{1215,1552},{1552,1620},{1620,1616},{1616,696},{696,1223},{1223,1719},{1719,1548},{1548,455},{455,920},{920,1601},{1601,1421},{1421,509},{509,257},{257,1007},{1007,680},{680,675},{675,240},{240,1682},{1682,661},{661,484},{484,327},{327,132},{132,1518},{1518,1827},{1827,687},{687,195},{195,1027},{1027,469},{469,752},{752,566},{566,280},{280,796},{796,104},{104,142},{142,750},{750,957},{957,425},{425,1272},{1272,239},{239,1446},{1446,1208},{1208,888},{888,1585},{1585,1655},{1655,391},{391,1905},{1905,1697},{1697,972},{972,1166},{1166,101},{101,65},{65,727},{727,797},{797,1795},{1795,1972},{1972,1808},{1808,558},{558,1745},{1745,1813},{1813,296},{296,826},{826,1901},{1901,12},{12,683},{683,1110},{1110,1312},{1312,1725},{1725,685},{685,691},{691,407},{407,1147},{1147,1809},{1809,1965},{1965,332},{332,1785},{1785,393},{393,639},{639,998},{998,976},{976,1381},{1381,1349},{1349,1402},{1402,60},{60,154},{154,93},{93,1784},{1784,1384},{1384,351},{351,1959},{1959,1826},{1826,855},{855,843},{843,1072},{1072,1865},{1865,1805},{1805,1231},{1231,1600},{1600,1517},{1517,394},{394,850},{850,1742},{1742,789},{789,442},{442,4},{4,169},{169,838},{838,631},{631,915},{915,932},{932,604},{604,1997},{1997,1995},{1995,230},{230,1799},{1799,309},{309,1209},{1209,1541},{1541,707},{707,90},{90,1288},{1288,1487},{1487,885},{885,146},{146,1256},{1256,137},{137,901},{901,520},{520,746},{746,148},{148,1911},{1911,1673},{1673,772},{772,597},{597,856},{856,61},{61,1503},{1503,507},{507,1568},{1568,288},{288,40},{40,996},{996,401},{401,1461},{1461,1464},{1464,46},{46,1240},{1240,20},{20,1743},{1743,1065},{1065,1056},{1056,79},{79,1579},{1579,1261},{1261,44},{44,767},{767,1932},{1932,292},{292,373},{373,1734},{1734,1968},{1968,1385},{1385,1501},{1501,321},{321,1605},{1605,350},{350,1786},{1786,598},{598,803},{803,1018},{1018,198},{198,757},{757,486},{486,468},{468,893},{893,924},{924,1573},{1573,126},{126,783},{783,1299},{1299,1358},{1358,26},{26,1263},{1263,758},{758,1014},{1014,927},{927,130},{130,729},{729,473},{473,1321},{1321,202},{202,210},{210,1693},{1693,657},{657,1259},{1259,1430},{1430,1328},{1328,1108},{1108,534},{534,1863},{1863,555},{555,1347},{1347,1392},{1392,1575},{1575,710},{710,654},{654,1079},{1079,1224},{1224,171},{171,1251},{1251,1352},{1352,1141},{1141,945},{945,1058},{1058,1172},{1172,1746},{1746,449},{449,1610},{1610,493},{493,1955},{1955,503},{503,450},{450,1717},{1717,1950},{1950,1638},{1638,1069},{1069,419},{419,170},{170,816},{816,152},{152,362},{362,1958},{1958,1005},{1005,813},{813,1213},{1213,956},{956,1216},{1216,1747},{1747,1153},{1153,1815},{1815,1031},{1031,1074},{1074,428},{428,625},{625,708},{708,1364},{1364,1102},{1102,857},{857,795},{795,1824},{1824,1935},{1935,1284},{1284,1419},{1419,717},{717,1094},{1094,23},{23,81},{81,1310},{1310,1624},{1624,701},{701,131},{131,541},{541,1702},{1702,1545},{1545,1322},{1322,270},{270,49},{49,742},{742,1145},{1145,726},{726,1372},{1372,1476},{1476,1249},{1249,1228},{1228,1810},{1810,1571},{1571,1986},{1986,1851},{1851,1171},{1171,1802},{1802,1028},{1028,1030},{1030,1126},{1126,1054},{1054,1091},{1091,278},{278,762},{762,824},{824,1481},{1481,1378},{1378,136},{136,755},{755,764},{764,216},{216,905},{905,1977},{1977,982},{982,1055},{1055,1357},{1357,1265},{1265,1546},{1546,1872},{1872,379},{379,1701},{1701,398},{398,1645},{1645,437},{437,1535},{1535,1904},{1904,78},{78,1612},{1612,1668},{1668,245},{245,849},{849,83},{83,954},{954,1558},{1558,1494},{1494,1239},{1239,964},{964,825},{825,1375},{1375,821},{821,68},{68,1443},{1443,869},{869,123},{123,470},{470,1647},{1647,1513},{1513,329},{329,1004},{1004,800},{800,517},{517,34},{34,423},{423,634},{634,562},{562,273},{273,1770},{1770,1316},{1316,713},{713,978},{978,315},{315,1678},{1678,1848},{1848,1077},{1077,1536},{1536,500},{500,662},{662,1910},{1910,147},{147,585},{585,777},{777,235},{235,421},{421,1733},{1733,22},{22,1214},{1214,1344},{1344,297},{297,1803},{1803,1849},{1849,874},{874,1879},{1879,934},{934,955},{955,831},{831,348},{348,1057},{1057,1011},{1011,1024},{1024,219},{219,1097},{1097,539},{539,870},{870,1351},{1351,810},{810,363},{363,487},{487,218},{218,454},{454,1956},{1956,1651},{1651,841},{841,480},{480,262},{262,1893},{1893,1941},{1941,1359},{1359,356},{356,347},{347,1083},{1083,1821},{1821,1478},{1478,180},{180,247},{247,333},{333,1468},{1468,771},{771,931},{931,1830},{1830,1390},{1390,232},{232,1080},{1080,322},{322,537},{537,1822},{1822,1595},{1595,666},{666,1823},{1823,248},{248,1368},{1368,1741},{1741,3},{3,1451},{1451,618},{618,1626},{1626,718},{718,939},{939,184},{184,1337},{1337,806},{806,1029},{1029,374},{374,11},{11,189},{189,947},{947,1066},{1066,1046},{1046,640},{640,124},{124,1976},{1976,420},{420,462},{462,670},{670,1037},{1037,456},{456,276},{276,89},{89,904},{904,140},{140,1895},{1895,1395},{1395,1563},{1563,1191},{1191,246},{246,1459},{1459,851},{851,1439},{1439,1766},{1766,92},{92,1582},{1582,1520},{1520,705},{705,54},{54,884},{884,743},{743,1832},{1832,1710},{1710,410},{410,1916},{1916,1045},{1045,1010},{1010,443},{443,15},{15,1247},{1247,1788},{1788,55},{55,549},{549,1232},{1232,1416},{1416,225},{225,8},{8,1529},{1529,1148},{1148,353},{353,1860},{1860,376},{376,531},{531,339},{339,418},{418,250},{250,733},{733,325},{325,258},{258,599},{599,951},{951,1730},{1730,959},{959,1658},{1658,331},{331,571},{571,1319},{1319,1762},{1762,551},{551,269},{269,1363},{1363,261},{261,121},{121,837},{837,842},{842,961},{961,1688},{1688,808},{808,1137},{1137,1143},{1143,220},{220,1990},{1990,1760},{1760,760},{760,1114},{1114,1164},{1164,1493},{1493,921},{921,1870},{1870,496},{496,731},{731,1767},{1767,1759},{1759,1499},{1499,1068},{1068,697},{697,914},{914,1169},{1169,1296},{1296,190},{190,1405},{1405,474},{474,435},{435,192},{192,149},{149,412},{412,1151},{1151,494},{494,1379},{1379,1020},{1020,1295},{1295,1233},{1233,608},{608,145},{145,74},{74,1246},{1246,846},{846,438},{438,263},{263,1167},{1167,1534},{1534,895},{895,1820},{1820,1282},{1282,1936},{1936,582},{582,1474},{1474,1285},{1285,396},{396,120},{120,698},{698,1407},{1407,1071},{1071,593},{593,944},{944,1197},{1197,1947},{1947,1161},{1161,938},{938,1796},{1796,340},{340,1470},{1470,971},{971,1376},{1376,1989},{1989,1107},{1107,1092},{1092,197},{197,1039},{1039,1480},{1480,215},{215,1445},{1445,1052},{1052,1420},{1420,1739},{1739,525},{525,1854},{1854,1257},{1257,937},{937,165},{165,1033},{1033,1212},{1212,568},{568,763},{763,313},{313,1681},{1681,1653},{1653,1637},{1637,207},{207,1264},{1264,953},{953,1580},{1580,415},{415,388},{388,110},{110,168},{168,1562},{1562,1944},{1944,822},{822,897},{897,1447},{1447,1355},{1355,871},{871,1812},{1812,1075},{1075,1076},{1076,161},{161,656},{656,1356},{1356,1294},{1294,203},{203,10},{10,383},{383,236},{236,1100},{1100,1317},{1317,294},{294,1348},{1348,1089},{1089,302},{302,209},{209,1279},{1279,1369},{1369,572},{572,1095},{1095,1975},{1975,64},{64,95},{95,1814},{1814,725},{725,1611},{1611,1783},{1783,1130},{1130,1334},{1334,1639},{1639,275},{275,759},{759,463},{463,689},{689,227},{227,1806},{1806,1971},{1971,975},{975,1828},{1828,1557},{1557,1889},{1889,1188},{1188,501},{501,1406},{1406,291},{291,968},{968,366},{366,1003},{1003,1135},{1135,1623},{1623,589},{589,488},{488,1366},{1366,1781},{1781,51},{51,610},{610,526},{526,135},{135,747},{747,1962},{1962,1192},{1192,312},{312,1134},{1134,349},{349,912},{912,732},{732,1908},{1908,1394},{1394,1723},{1723,820},{820,616},{616,926},{926,1773},{1773,624},{624,868},{868,660},{660,563},{563,1942},{1942,1883},{1883,319},{319,1619},{1619,39},{39,1465},{1465,962},{962,1160},{1160,606},{606,406},{406,1839},{1839,711},{711,58},{58,1021},{1021,775},{775,1339},{1339,38},{38,231},{231,1925},{1925,119},{119,1881},{1881,1829},{1829,532},{532,1128},{1128,561},{561,41},{41,533},{533,1735},{1735,802},{802,32},{32,858},{858,1640},{1640,459},{459,1907},{1907,1318},{1318,875},{875,1195},{1195,545},{545,1566},{1566,1514},{1514,958},{958,1484},{1484,1550},{1550,1196},{1196,1869},{1869,35},{35,228},{228,217},{217,950},{950,1165},{1165,1594},{1594,502},{502,444},{444,1900},{1900,337},{337,1088},{1088,635},{635,84},{84,1974},{1974,471},{471,94},{94,676},{676,178},{178,1793},{1793,48},{48,73},{73,1409},{1409,1523},{1523,734},{734,191},{191,382},{382,577},{577,642},{642,899},{899,1186},{1186,1711},{1711,965},{965,56},{56,1670},{1670,1868},{1868,580},{580,268},{268,436},{436,1001},{1001,212},{212,1238},{1238,514},{514,1185},{1185,1857},{1857,1732},{1732,1897},{1897,432},{432,1096},{1096,1393},{1393,1597},{1597,516},{516,1664},{1664,163},{163,1305},{1305,326},{326,748},{748,1549},{1549,922},{922,1937},{1937,1635},{1635,787},{787,575},{575,1244},{1244,693},{693,735},{735,369},{369,1533},{1533,427},{427,1111},{1111,892},{892,1512},{1512,681},{681,774},{774,1570},{1570,807},{807,141},{141,1700},{1700,1939},{1939,1755},{1755,17},{17,1938},{1938,1200},{1200,1761},{1761,1722},{1722,1168},{1168,1098},{1098,780},{780,714},{714,1604},{1604,343},{343,1631},{1631,433},{433,1449},{1449,293},{293,515},{515,1572},{1572,103},{103,1790},{1790,408},{408,1819},{1819,1287},{1287,860},{860,557},{557,910},{910,105},{105,283},{283,1583},{1583,174},{174,559},{559,1155},{1155,804},{804,611},{611,1923},{1923,1173},{1173,613},{613,761},{761,1853},{1853,913},{913,1113},{1113,1738},{1738,766},{766,194},{194,1675},{1675,1876},{1876,1696},{1696,649},{649,829},{829,583},{583,946},{946,1515},{1515,658},{658,1227},{1227,1124},{1124,1453},{1453,416},{416,1544},{1544,667},{667,1555},{1555,1522},{1522,736},{736,1132},{1132,1538},{1538,290},{290,1933},{1933,1343},{1343,1490},{1490,864},{864,1150},{1150,221},{221,853},{853,264},{264,607},{607,1106},{1106,1325},{1325,700},{700,1120},{1120,1613},{1613,1521},{1521,122},{122,1189},{1189,175},{175,205},{205,1360},{1360,1708},{1708,1617},{1617,1750},{1750,1530},{1530,113},{113,854},{854,1707},{1707,504},{504,1162},{1162,907},{907,24},{24,481},{481,902},{902,1374},{1374,588},{588,587},{587,877},{877,1577},{1577,682},{682,1505},{1505,564},{564,630},{630,439},{439,1043},{1043,702},{702,1569},{1569,1553},{1553,527},{527,138},{138,1777},{1777,1694},{1694,724},{724,569},{569,1841},{1841,812},{812,574},{574,1744},{1744,1492},{1492,1669},{1669,1327},{1327,1308},{1308,1237},{1237,769},{769,304},{304,1444},{1444,1115},{1115,242},{242,1062},{1062,948},{948,1353},{1353,1270},{1270,1622},{1622,552},{552,1496},{1496,1748},{1748,159},{159,542},{542,739},{739,1025},{1025,1510},{1510,1400},{1400,1408},{1408,1867},{1867,991},{991,830},{830,1008},{1008,715},{715,553},{553,1320},{1320,1729},{1729,1262},{1262,1061},{1061,182},{182,1654},{1654,238},{238,1154},{1154,709},{709,1686},{1686,663},{663,633},{633,1462},{1462,1593},{1593,579},{579,1690},{1690,987},{987,267},{267,614},{614,1999},{1999,1365},{1365,91},{91,1927},{1927,1002},{1002,479},{479,1987},{1987,768},{768,153},{153,993},{993,156},{156,1438},{1438,1081},{1081,1596},{1596,30},{30,1913},{1913,497},{497,1},{1,1539},{1539,1219},{1219,845},{845,338},{338,1885},{1885,387},{387,1023},{1023,744},{744,1630},{1630,106},{106,1292},{1292,286},{286,1915},{1915,919},{919,45},{45,889},{889,706},{706,1255},{1255,506},{506,1831},{1831,1661},{1661,1221},{1221,166},{166,1194},{1194,952},{952,677},{677,1847},{1847,1423},{1423,1397},{1397,76},{76,303},{303,1946},{1946,1229},{1229,799},{799,1527},{1527,451},{451,1887},{1887,287},{287,523},{523,1441},{1441,1060},{1060,1698},{1698,1540},{1540,476},{476,13},{13,578},{578,1737},{1737,211},{211,229},{229,1241},{1241,1417},{1417,839},{839,1771},{1771,1765},{1765,1313},{1313,1422},{1422,818},{818,1607},{1607,623},{623,1431},{1431,112},{112,1036},{1036,1878},{1878,237},{237,1543},{1543,1482},{1482,908},{908,307},{307,368},{368,1146},{1146,834},{834,1504},{1504,1268},{1268,521},{521,1650},{1650,819},{819,651},{651,1551},{1551,0},{0,133},{133,1567},{1567,1304},{1304,1994},{1994,765},{765,1090},{1090,308},{308,222},{222,1966},{1966,2},{2,1290},{1290,678},{678,1477},{1477,1193},{1193,1754},{1754,1403},{1403,1163},{1163,1922},{1922,1210},{1210,530},{530,1032},{1032,1391},{1391,1278},{1278,1588},{1588,316},{316,1667},{1667,300},{300,395},{395,63},{63,918},{918,47},{47,272},{272,495},{495,848},{848,1663},{1663,1727},{1727,601},{601,1361},{1361,498},{498,1574},{1574,941},{941,1757},{1757,1457},{1457,1040},{1040,485},{485,878},{878,1864},{1864,323},{323,1201},{1201,1811},{1811,1473},{1473,1621},{1621,1858},{1858,1078},{1078,1335},{1335,684},{684,1756},{1756,367},{367,1303},{1303,1590},{1590,1764},{1764,524},{524,426},{426,1415},{1415,1340},{1340,1082},{1082,916},{916,1176},{1176,1311},{1311,1614},{1614,751},{751,1333},{1333,1906},{1906,1684},{1684,1377},{1377,477},{477,1589},{1589,85},{85,1125},{1125,157},{157,1140},{1140,1315},{1315,1338},{1338,359},{359,1136},{1136,244},{244,1158},{1158,150},{150,1411},{1411,1245},{1245,1371},{1371,1250},{1250,1794},{1794,847},{847,1502},{1502,381},{381,42},{42,295},{295,632},{632,1963},{1963,1475},{1475,692},{692,1336},{1336,1006},{1006,25},{25,770},{770,567},{567,704},{704,345},{345,254},{254,1211},{1211,160},{160,995},{995,397},{397,992},{992,1980},{1980,187},{187,1086},{1086,801},{801,1271},{1271,1047},{1047,1511},{1511,1843},{1843,792},{792,1038},{1038,464},{464,59},{59,1769},{1769,643},{643,753},{753,52},{52,1957},{1957,974},{974,1662},{1662,1497},{1497,1559},{1559,75},{75,1424},{1424,70},{70,80},{80,430},{430,208},{208,1460},{1460,584},{584,346},{346,358},{358,1301},{1301,629},{629,1404},{1404,1625},{1625,894},{894,776},{776,378},{378,1602},{1602,1410},{1410,282},{282,21},{21,6},{6,1207},{1207,458},{458,409},{409,1632},{1632,1500},{1500,1659},{1659,1495},{1495,779},{779,377},{377,179},{179,1050},{1050,1714},{1714,364},{364,1469},{1469,881},{881,424},{424,489},{489,389},{389,1203},{1203,213},{213,641},{641,143},{143,1433},{1433,1488},{1488,535},{535,1452},{1452,167},{167,226},{226,1652},{1652,647},{647,460},{460,499},{499,872},{872,1133},{1133,1064},{1064,1516},{1516,1791},{1791,882},{882,452},{452,53},{53,778},{778,1184},{1184,547},{547,505},{505,900},{900,1943},{1943,125},{125,1780},{1780,1894},{1894,1634},{1634,1324},{1324,679},{679,1856},{1856,1649},{1649,863},{863,536},{536,1051},{1051,107},{107,1300},{1300,1531},{1531,204},{204,1289},{1289,37},{37,1547},{1547,43},{43,1491},{1491,223},{223,1063},{1063,929},{929,1934},{1934,522},{522,600},{600,172},{172,544},{544,1928},{1928,71},{71,1170},{1170,1629},{1629,1236},{1236,279},{279,1918},{1918,1101},{1101,1016},{1016,749},{749,1862},{1862,602},{602,827},{827,1685},{1685,342},{342,1787},{1787,672},{672,985},{985,1456},{1456,664},{664,1598},{1598,1850},{1850,1924},{1924,352},{352,1199},{1199,1252},{1252,1436},{1436,1656},{1656,1807},{1807,942},{942,619},{619,116},{116,1985},{1985,1556},{1556,1581},{1581,879},{879,981},{981,186},{186,570},{570,737},{737,1528},{1528,786},{786,1070},{1070,234},{234,440},{440,1293},{1293,1117},{1117,193},{193,1220},{1220,1129},{1129,1418},{1418,1618},{1618,384},{384,1269},{1269,108},{108,1833},{1833,199},{199,233},{233,19},{19,360},{360,798},{798,214},{214,465},{465,5},{5,9},{9,1840},{1840,1388},{1388,690},{690,817},{817,1508},{1508,1142},{1142,403},{403,1903},{1903,36},{36,86},{86,898},{898,1695},{1695,1909},{1909,1891},{1891,1752},{1752,528},{528,1222},{1222,1859},{1859,1015},{1015,441},{441,949},{949,1330},{1330,716},{716,1382},{1382,1713},{1713,1463},{1463,1235},{1235,1917},{1917,1712},{1712,1458},{1458,1123},{1123,1898},{1898,289},{289,1578},{1578,1846},{1846,1789},{1789,1665},{1665,1009},{1009,990},{990,790},{790,1736},{1736,973},{973,453},{453,1177},{1177,674},{674,1537},{1537,1689},{1689,196},{196,832},{832,935},{935,940},{940,445},{445,518},{518,1139},{1139,265},{265,1973},{1973,828},{828,1967},{1967,1309},{1309,1242},{1242,1373},{1373,1554},{1554,782},{782,1565},{1565,659},{659,1149},{1149,1716},{1716,72},{72,98},{98,1276},{1276,983},{983,305},{305,867},{867,862},{862,594},{594,1948},{1948,1354},{1354,1138},{1138,447},{447,805},{805,1998},{1998,1084},{1084,603},{603,134},{134,1825},{1825,617},{617,1992},{1992,979},{979,1053},{1053,814},{814,1804},{1804,1561},{1561,1835},{1835,911},{911,1341},{1341,341},{341,1489},{1489,334},{334,712},{712,1297},{1297,1383},{1383,648},{648,50},{50,1067},{1067,1048},{1048,1633},{1633,151},{151,943},{943,1022},{1022,7},{7,1816},{1816,788},{788,861},{861,988},{988,1234},{1234,1952},{1952,1715},{1715,1283},{1283,446},{446,1703},{1703,923},{923,255},{255,1119},{1119,357},{357,1930},{1930,173},{173,1281},{1281,1644},{1644,605},{605,1019},{1019,1286},{1286,638},{638,891},{891,29},{29,519},{519,1532},{1532,1519},{1519,1087},{1087,581},{581,1981},{1981,336},{336,785},{785,1205},{1205,989},{989,1817},{1817,512},{512,592},{592,1838},{1838,977},{977,1049},{1049,320},{320,880},{880,823},{823,1643},{1643,1996},{1996,100},{100,111},{111,344},{344,781}};
        boolean res = obj.canFinish(2000, matr);
        System.out.println(res);
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0)
            return true;
        Set<Integer> finished = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++) {
            if(map.containsKey(prerequisites[i][0]))
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], list);
            }
        }
        for(int i = 0; i < numCourses; i++)
            helper(map, finished, new HashSet<>(), i);
        return finished.size() == numCourses;
    }

    private boolean helper(Map<Integer, List<Integer>> map, Set<Integer> finished, Set<Integer> visited, int i) {
        if(finished.contains(i))
            return true;
        if(visited.contains(i))
            return false;
        visited.add(i);
        if(map.containsKey(i)) {
            for(int temp : map.get(i)) {
                if(!helper(map, finished, visited, temp))
                    return false;
            }
        }
        finished.add(i);
        return true;
    }
}
