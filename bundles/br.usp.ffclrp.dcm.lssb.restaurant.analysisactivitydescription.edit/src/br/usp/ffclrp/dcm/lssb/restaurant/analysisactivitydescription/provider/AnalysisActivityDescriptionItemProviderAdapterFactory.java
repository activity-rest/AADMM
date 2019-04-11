/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.provider;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util.AnalysisActivityDescriptionAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisActivityDescriptionItemProviderAdapterFactory extends AnalysisActivityDescriptionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDatasetItemProvider inputDatasetItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputDatasetAdapter() {
		if (inputDatasetItemProvider == null) {
			inputDatasetItemProvider = new InputDatasetItemProvider(this);
		}

		return inputDatasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDatasetItemProvider outputDatasetItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputDatasetAdapter() {
		if (outputDatasetItemProvider == null) {
			outputDatasetItemProvider = new OutputDatasetItemProvider(this);
		}

		return outputDatasetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineToolItemProvider commandLineToolItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandLineToolAdapter() {
		if (commandLineToolItemProvider == null) {
			commandLineToolItemProvider = new CommandLineToolItemProvider(this);
		}

		return commandLineToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitCodeItemProvider exitCodeItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitCodeAdapter() {
		if (exitCodeItemProvider == null) {
			exitCodeItemProvider = new ExitCodeItemProvider(this);
		}

		return exitCodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolNameCommandLineEntryItemProvider toolNameCommandLineEntryItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolNameCommandLineEntryAdapter() {
		if (toolNameCommandLineEntryItemProvider == null) {
			toolNameCommandLineEntryItemProvider = new ToolNameCommandLineEntryItemProvider(this);
		}

		return toolNameCommandLineEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralCommandLineEntryListItemProvider literalCommandLineEntryListItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralCommandLineEntryListAdapter() {
		if (literalCommandLineEntryListItemProvider == null) {
			literalCommandLineEntryListItemProvider = new LiteralCommandLineEntryListItemProvider(this);
		}

		return literalCommandLineEntryListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetCommandLineEntryListItemProvider datasetCommandLineEntryListItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatasetCommandLineEntryListAdapter() {
		if (datasetCommandLineEntryListItemProvider == null) {
			datasetCommandLineEntryListItemProvider = new DatasetCommandLineEntryListItemProvider(this);
		}

		return datasetCommandLineEntryListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCommandLineEntryListItemProvider parameterCommandLineEntryListItemProvider;

	/**
	 * This creates an adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterCommandLineEntryListAdapter() {
		if (parameterCommandLineEntryListItemProvider == null) {
			parameterCommandLineEntryListItemProvider = new ParameterCommandLineEntryListItemProvider(this);
		}

		return parameterCommandLineEntryListItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (activityItemProvider != null) activityItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (inputDatasetItemProvider != null) inputDatasetItemProvider.dispose();
		if (outputDatasetItemProvider != null) outputDatasetItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (commandLineToolItemProvider != null) commandLineToolItemProvider.dispose();
		if (exitCodeItemProvider != null) exitCodeItemProvider.dispose();
		if (toolNameCommandLineEntryItemProvider != null) toolNameCommandLineEntryItemProvider.dispose();
		if (literalCommandLineEntryListItemProvider != null) literalCommandLineEntryListItemProvider.dispose();
		if (datasetCommandLineEntryListItemProvider != null) datasetCommandLineEntryListItemProvider.dispose();
		if (parameterCommandLineEntryListItemProvider != null) parameterCommandLineEntryListItemProvider.dispose();
	}

}
