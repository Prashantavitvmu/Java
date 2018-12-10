/**
 *
 */
package com.au.bisley.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.AbstractProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.au.bisley.core.model.BisleyProductModel;


/**
 * @author PSC_LP__0145
 * @param <SOURCE>
 *
 */

public class BisleyProductPopulator extends AbstractProductPopulator<ProductModel, ProductData>
{




	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{

final BisleyProductModel bisleyProductModel=(BisleyProductModel) source;

		target.setArrivalDate(bisleyProductModel.getArrivalDate());
		target.setPromotionalMessage(bisleyProductModel.getPromotionalMessage());


	}




}