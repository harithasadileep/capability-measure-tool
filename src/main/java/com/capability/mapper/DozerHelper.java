package com.capability.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

/**
 *
 * @author dsomajohassula
 * 
 * The Class DozerHelper.
 */
public class DozerHelper {
	
	/**
	 * Map.
	 *
	 * @param <T> the generic type
	 * @param <U> the generic type
	 * @param mapper the mapper
	 * @param source the source
	 * @param destType the dest type
	 * @return the array list
	 */
	@SuppressWarnings("unchecked")
	public static <T, U> ArrayList<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {
		final ArrayList<U> dest = new ArrayList<U>();
		for (T element : source) {
			if (element == null) {
				continue;
			}
			dest.add(mapper.map(element, destType));
		}
		@SuppressWarnings("rawtypes")
		List s1 = new ArrayList();
		s1.add(null);
		dest.removeAll(s1);
		return dest;
	}
}
