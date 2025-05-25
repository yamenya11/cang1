// Generated from C:/Users/Yamen/IdeaProjects/Finalangular/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPORTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterIMPORTLABEL(AngularParser.IMPORTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitIMPORTLABEL(AngularParser.IMPORTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPONENTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPONENTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASSLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterCLASSLABEL(AngularParser.CLASSLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASSLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitCLASSLABEL(AngularParser.CLASSLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INJECTABLELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INJECTABLELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 */
	void enterKeyimport(AngularParser.KeyimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 */
	void exitKeyimport(AngularParser.KeyimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectable}.
	 * @param ctx the parse tree
	 */
	void enterInjectable(AngularParser.InjectableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectable}.
	 * @param ctx the parse tree
	 */
	void exitInjectable(AngularParser.InjectableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(AngularParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(AngularParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterBasicMetadataLabel(AngularParser.BasicMetadataLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitBasicMetadataLabel(AngularParser.BasicMetadataLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMetadataLabel(AngularParser.HtmlMetadataLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMetadataLabel(AngularParser.HtmlMetadataLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELECTORLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterSELECTORLABEL(AngularParser.SELECTORLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELECTORLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitSELECTORLABEL(AngularParser.SELECTORLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAMPLATEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterTAMPLATEURLLABEL(AngularParser.TAMPLATEURLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAMPLATEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitTAMPLATEURLLABEL(AngularParser.TAMPLATEURLLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateurl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateurl(AngularParser.TemplateurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateurl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateurl(AngularParser.TemplateurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#basicMetadata}.
	 * @param ctx the parse tree
	 */
	void enterBasicMetadata(AngularParser.BasicMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#basicMetadata}.
	 * @param ctx the parse tree
	 */
	void exitBasicMetadata(AngularParser.BasicMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlMetadata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMetadata(AngularParser.HtmlMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlMetadata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMetadata(AngularParser.HtmlMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void enterClassInheritance(AngularParser.ClassInheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void exitClassInheritance(AngularParser.ClassInheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#getproduct}.
	 * @param ctx the parse tree
	 */
	void enterGetproduct(AngularParser.GetproductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#getproduct}.
	 * @param ctx the parse tree
	 */
	void exitGetproduct(AngularParser.GetproductContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(AngularParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(AngularParser.ProductsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ELEMENTLISTLABEL}
	 * labeled alternative in {@link AngularParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterELEMENTLISTLABEL(AngularParser.ELEMENTLISTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ELEMENTLISTLABEL}
	 * labeled alternative in {@link AngularParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitELEMENTLISTLABEL(AngularParser.ELEMENTLISTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ELEMENTLABEL}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterELEMENTLABEL(AngularParser.ELEMENTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ELEMENTLABEL}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitELEMENTLABEL(AngularParser.ELEMENTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PAIRLABEL}
	 * labeled alternative in {@link AngularParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPAIRLABEL(AngularParser.PAIRLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PAIRLABEL}
	 * labeled alternative in {@link AngularParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPAIRLABEL(AngularParser.PAIRLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASEvalueLABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASEvalueLABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAYTAYPELABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAYTAYPELABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIRELABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIRELABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRINGLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterSTRINGLABEL(AngularParser.STRINGLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRINGLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitSTRINGLABEL(AngularParser.STRINGLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBERLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterNUMBERLABEL(AngularParser.NUMBERLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBERLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitNUMBERLABEL(AngularParser.NUMBERLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANYLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterANYLABEL(AngularParser.ANYLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANYLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitANYLABEL(AngularParser.ANYLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VOIDLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterVOIDLABEL(AngularParser.VOIDLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VOIDLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitVOIDLABEL(AngularParser.VOIDLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ONINITLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterONINITLABEL(AngularParser.ONINITLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ONINITLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitONINITLABEL(AngularParser.ONINITLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterNULLLABEL(AngularParser.NULLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitNULLLABEL(AngularParser.NULLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTYLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTYLABEL(AngularParser.PROPERTYLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTYLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTYLABEL(AngularParser.PROPERTYLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code METHODLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterMETHODLABEL(AngularParser.METHODLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code METHODLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitMETHODLABEL(AngularParser.METHODLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTRUCTURELABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterCONSTRUCTURELABEL(AngularParser.CONSTRUCTURELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTRUCTURELABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitCONSTRUCTURELABEL(AngularParser.CONSTRUCTURELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STATMENTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterSTATMENTLABEL(AngularParser.STATMENTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STATMENTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitSTATMENTLABEL(AngularParser.STATMENTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECTORLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterDECTORLABEL(AngularParser.DECTORLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECTORLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitDECTORLABEL(AngularParser.DECTORLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NGOMINITLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterNGOMINITLABEL(AngularParser.NGOMINITLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NGOMINITLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitNGOMINITLABEL(AngularParser.NGOMINITLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELECTPRODUTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterSELECTPRODUTLABEL(AngularParser.SELECTPRODUTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELECTPRODUTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitSELECTPRODUTLABEL(AngularParser.SELECTPRODUTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ONBUTTONLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterONBUTTONLABEL(AngularParser.ONBUTTONLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ONBUTTONLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitONBUTTONLABEL(AngularParser.ONBUTTONLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETPRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterGETPRODUCTLABEL(AngularParser.GETPRODUCTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETPRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitGETPRODUCTLABEL(AngularParser.GETPRODUCTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterPRODUCTLABEL(AngularParser.PRODUCTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitPRODUCTLABEL(AngularParser.PRODUCTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LAMBDALABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterLAMBDALABEL(AngularParser.LAMBDALABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LAMBDALABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitLAMBDALABEL(AngularParser.LAMBDALABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTYAACCESSLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTYAACCESSLABEL(AngularParser.PROPERTYAACCESSLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTYAACCESSLABEL}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTYAACCESSLABEL(AngularParser.PROPERTYAACCESSLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPIRTYLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPIRTYLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIBALLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVARIBALLABEL(AngularParser.VARIBALLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIBALLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVARIBALLABEL(AngularParser.VARIBALLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDD}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDDD(AngularParser.DDDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDD}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDDD(AngularParser.DDDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#regularProperty}.
	 * @param ctx the parse tree
	 */
	void enterRegularProperty(AngularParser.RegularPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#regularProperty}.
	 * @param ctx the parse tree
	 */
	void exitRegularProperty(AngularParser.RegularPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#letDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#letDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTRACTUR}
	 * labeled alternative in {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterCONSTRACTUR(AngularParser.CONSTRACTURContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTRACTUR}
	 * labeled alternative in {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitCONSTRACTUR(AngularParser.CONSTRACTURContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictEquality(AngularParser.StrictEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictEquality(AngularParser.StrictEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LooseEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLooseEquality(AngularParser.LooseEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LooseEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLooseEquality(AngularParser.LooseEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEquality(AngularParser.NotEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEquality(AngularParser.NotEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictNotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictNotEquality(AngularParser.StrictNotEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictNotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictNotEquality(AngularParser.StrictNotEqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARAMETERLABEL}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterPARAMETERLABEL(AngularParser.PARAMETERLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARAMETERLABEL}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitPARAMETERLABEL(AngularParser.PARAMETERLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(AngularParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(AngularParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMINMIN(AngularParser.EXPMINMINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMINMIN(AngularParser.EXPMINMINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPSTAR}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPSTAR(AngularParser.EXPSTARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPSTAR}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPSTAR(AngularParser.EXPSTARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMINUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMINUS(AngularParser.EXPMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMINUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMINUS(AngularParser.EXPMINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPRO}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPRO(AngularParser.EXPPROContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPRO}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPRO(AngularParser.EXPPROContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPNUMBER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPNUMBER(AngularParser.EXPNUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPNUMBER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPNUMBER(AngularParser.EXPNUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPINTEGER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPINTEGER(AngularParser.EXPINTEGERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPINTEGER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPINTEGER(AngularParser.EXPINTEGERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPLUSPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPLUSPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPAREN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPAREN(AngularParser.EXPPARENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPAREN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPAREN(AngularParser.EXPPARENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPLUS(AngularParser.EXPPLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPLUS(AngularParser.EXPPLUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPGREATER(AngularParser.EXPGREATERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPGREATER(AngularParser.EXPGREATERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CALFUNLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterCALFUNLABEL(AngularParser.CALFUNLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CALFUNLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitCALFUNLABEL(AngularParser.CALFUNLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDDOTLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterIDDOTLABEL(AngularParser.IDDOTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDDOTLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitIDDOTLABEL(AngularParser.IDDOTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTHISLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTHISLABEL(AngularParser.FUNCTHISLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTHISLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTHISLABEL(AngularParser.FUNCTHISLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#calfun}.
	 * @param ctx the parse tree
	 */
	void enterCalfun(AngularParser.CalfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#calfun}.
	 * @param ctx the parse tree
	 */
	void exitCalfun(AngularParser.CalfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#iddot}.
	 * @param ctx the parse tree
	 */
	void enterIddot(AngularParser.IddotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#iddot}.
	 * @param ctx the parse tree
	 */
	void exitIddot(AngularParser.IddotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functhis}.
	 * @param ctx the parse tree
	 */
	void enterFuncthis(AngularParser.FuncthisContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functhis}.
	 * @param ctx the parse tree
	 */
	void exitFuncthis(AngularParser.FuncthisContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectProduct}.
	 * @param ctx the parse tree
	 */
	void enterSelectProduct(AngularParser.SelectProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectProduct}.
	 * @param ctx the parse tree
	 */
	void exitSelectProduct(AngularParser.SelectProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void enterPropertySignature(AngularParser.PropertySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void exitPropertySignature(AngularParser.PropertySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(AngularParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(AngularParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter2}.
	 * @param ctx the parse tree
	 */
	void enterParameter2(AngularParser.Parameter2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter2}.
	 * @param ctx the parse tree
	 */
	void exitParameter2(AngularParser.Parameter2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#onbutton}.
	 * @param ctx the parse tree
	 */
	void enterOnbutton(AngularParser.OnbuttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#onbutton}.
	 * @param ctx the parse tree
	 */
	void exitOnbutton(AngularParser.OnbuttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrayvalue(AngularParser.ArrayvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrayvalue(AngularParser.ArrayvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngOnInit}.
	 * @param ctx the parse tree
	 */
	void enterNgOnInit(AngularParser.NgOnInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngOnInit}.
	 * @param ctx the parse tree
	 */
	void exitNgOnInit(AngularParser.NgOnInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(AngularParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(AngularParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularButton}.
	 * @param ctx the parse tree
	 */
	void enterAngularButton(AngularParser.AngularButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularButton}.
	 * @param ctx the parse tree
	 */
	void exitAngularButton(AngularParser.AngularButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(AngularParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(AngularParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#opentag}.
	 * @param ctx the parse tree
	 */
	void enterOpentag(AngularParser.OpentagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#opentag}.
	 * @param ctx the parse tree
	 */
	void exitOpentag(AngularParser.OpentagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closetag}.
	 * @param ctx the parse tree
	 */
	void enterClosetag(AngularParser.ClosetagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closetag}.
	 * @param ctx the parse tree
	 */
	void exitClosetag(AngularParser.ClosetagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void enterNgfor(AngularParser.NgforContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void exitNgfor(AngularParser.NgforContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interp}.
	 * @param ctx the parse tree
	 */
	void enterInterp(AngularParser.InterpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interp}.
	 * @param ctx the parse tree
	 */
	void exitInterp(AngularParser.InterpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifierChain}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierChain(AngularParser.IdentifierChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifierChain}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierChain(AngularParser.IdentifierChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(AngularParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(AngularParser.TextNodeContext ctx);
}