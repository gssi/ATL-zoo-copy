<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="TypeA2TypeB"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchBlkA2BlkB():V"/>
		<constant value="A.__matchPortA2InPortB():V"/>
		<constant value="A.__matchPortA2OutPortB():V"/>
		<constant value="__exec__"/>
		<constant value="BlkA2BlkB"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyBlkA2BlkB(NTransientLink;):V"/>
		<constant value="PortA2InPortB"/>
		<constant value="A.__applyPortA2InPortB(NTransientLink;):V"/>
		<constant value="PortA2OutPortB"/>
		<constant value="A.__applyPortA2OutPortB(NTransientLink;):V"/>
		<constant value="__matchBlkA2BlkB"/>
		<constant value="BlockA"/>
		<constant value="TypeA"/>
		<constant value="inA"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="blkA"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="blkB"/>
		<constant value="BlockB"/>
		<constant value="TypeB"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:10-11:22"/>
		<constant value="11:3-14:4"/>
		<constant value="__applyBlkA2BlkB"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="inputPorts"/>
		<constant value="outputPorts"/>
		<constant value="12:18-12:22"/>
		<constant value="12:18-12:33"/>
		<constant value="12:4-12:33"/>
		<constant value="13:19-13:23"/>
		<constant value="13:19-13:35"/>
		<constant value="13:4-13:35"/>
		<constant value="link"/>
		<constant value="__matchPortA2InPortB"/>
		<constant value="PortA"/>
		<constant value="J.allInstances():J"/>
		<constant value="J.includes(J):J"/>
		<constant value="B.not():B"/>
		<constant value="24"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.notEmpty():J"/>
		<constant value="48"/>
		<constant value="s"/>
		<constant value="t"/>
		<constant value="InPortB"/>
		<constant value="19:20-19:32"/>
		<constant value="19:20-19:47"/>
		<constant value="19:60-19:61"/>
		<constant value="19:60-19:72"/>
		<constant value="19:83-19:84"/>
		<constant value="19:60-19:85"/>
		<constant value="19:20-19:86"/>
		<constant value="19:20-19:98"/>
		<constant value="21:7-21:20"/>
		<constant value="21:3-23:4"/>
		<constant value="__applyPortA2InPortB"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="__matchPortA2OutPortB"/>
		<constant value="OutPortB"/>
		<constant value="28:20-28:32"/>
		<constant value="28:20-28:47"/>
		<constant value="28:60-28:61"/>
		<constant value="28:60-28:73"/>
		<constant value="28:84-28:85"/>
		<constant value="28:60-28:86"/>
		<constant value="28:20-28:87"/>
		<constant value="28:20-28:99"/>
		<constant value="30:7-30:21"/>
		<constant value="30:3-32:4"/>
		<constant value="__applyPortA2OutPortB"/>
		<constant value="31:12-31:13"/>
		<constant value="31:12-31:18"/>
		<constant value="31:4-31:18"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<call arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<call arg="10"/>
			<call arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<call arg="15"/>
			<getasm/>
			<call arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<call arg="40"/>
			<getasm/>
			<call arg="41"/>
			<getasm/>
			<call arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<call arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<call arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<call arg="63"/>
			<pusht/>
			<call arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="21" end="23"/>
			<lne id="66" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="67">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="72"/>
			<call arg="30"/>
			<set arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="73"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="74" begin="11" end="11"/>
			<lne id="75" begin="11" end="12"/>
			<lne id="76" begin="9" end="14"/>
			<lne id="77" begin="17" end="17"/>
			<lne id="78" begin="17" end="18"/>
			<lne id="79" begin="15" end="20"/>
			<lne id="66" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="21"/>
			<lve slot="2" name="58" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="80" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="81">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="82"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<call arg="83"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<get arg="72"/>
			<load arg="19"/>
			<call arg="84"/>
			<call arg="85"/>
			<if arg="86"/>
			<load arg="29"/>
			<call arg="87"/>
			<enditerate/>
			<call arg="88"/>
			<call arg="85"/>
			<if arg="89"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<call arg="57"/>
			<dup/>
			<push arg="90"/>
			<load arg="19"/>
			<call arg="59"/>
			<dup/>
			<push arg="91"/>
			<push arg="92"/>
			<push arg="62"/>
			<new/>
			<call arg="63"/>
			<pusht/>
			<call arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="93" begin="10" end="12"/>
			<lne id="94" begin="10" end="13"/>
			<lne id="95" begin="16" end="16"/>
			<lne id="96" begin="16" end="17"/>
			<lne id="97" begin="18" end="18"/>
			<lne id="98" begin="16" end="19"/>
			<lne id="99" begin="7" end="24"/>
			<lne id="100" begin="7" end="25"/>
			<lne id="101" begin="42" end="44"/>
			<lne id="102" begin="40" end="45"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="15" end="23"/>
			<lve slot="1" name="90" begin="6" end="47"/>
			<lve slot="0" name="17" begin="0" end="48"/>
		</localvariabletable>
	</operation>
	<operation name="103">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="90"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="91"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="104" begin="11" end="11"/>
			<lne id="105" begin="11" end="12"/>
			<lne id="106" begin="9" end="14"/>
			<lne id="102" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="91" begin="7" end="15"/>
			<lve slot="2" name="90" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="80" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="107">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="82"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<call arg="83"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<get arg="73"/>
			<load arg="19"/>
			<call arg="84"/>
			<call arg="85"/>
			<if arg="86"/>
			<load arg="29"/>
			<call arg="87"/>
			<enditerate/>
			<call arg="88"/>
			<call arg="85"/>
			<if arg="89"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<call arg="57"/>
			<dup/>
			<push arg="90"/>
			<load arg="19"/>
			<call arg="59"/>
			<dup/>
			<push arg="91"/>
			<push arg="108"/>
			<push arg="62"/>
			<new/>
			<call arg="63"/>
			<pusht/>
			<call arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="109" begin="10" end="12"/>
			<lne id="110" begin="10" end="13"/>
			<lne id="111" begin="16" end="16"/>
			<lne id="112" begin="16" end="17"/>
			<lne id="113" begin="18" end="18"/>
			<lne id="114" begin="16" end="19"/>
			<lne id="115" begin="7" end="24"/>
			<lne id="116" begin="7" end="25"/>
			<lne id="117" begin="42" end="44"/>
			<lne id="118" begin="40" end="45"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="15" end="23"/>
			<lve slot="1" name="90" begin="6" end="47"/>
			<lve slot="0" name="17" begin="0" end="48"/>
		</localvariabletable>
	</operation>
	<operation name="119">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="90"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="91"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="120" begin="11" end="11"/>
			<lne id="121" begin="11" end="12"/>
			<lne id="122" begin="9" end="14"/>
			<lne id="118" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="91" begin="7" end="15"/>
			<lve slot="2" name="90" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="80" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
