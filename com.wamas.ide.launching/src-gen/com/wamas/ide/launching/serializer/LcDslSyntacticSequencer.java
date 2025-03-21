/*
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.serializer;

import com.google.inject.Inject;
import com.wamas.ide.launching.services.LcDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LcDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LcDslGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LcDslGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBLOCK_BEGINRule())
			return getBLOCK_BEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBLOCK_ENDRule())
			return getBLOCK_ENDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBRACKET_CLOSERule())
			return getBRACKET_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBRACKET_OPENRule())
			return getBRACKET_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQRule())
			return getEQToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BLOCK_BEGIN: '{';
	 */
	protected String getBLOCK_BEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal BLOCK_END: '}';
	 */
	protected String getBLOCK_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal BRACKET_CLOSE: ')';
	 */
	protected String getBRACKET_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal BRACKET_OPEN: '(';
	 */
	protected String getBRACKET_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal EQ: '=';
	 */
	protected String getEQToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
