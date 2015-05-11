package fr.tse.fi2.hpp.labs.queries.impl.lab1;

import fr.tse.fi2.hpp.labs.beans.DebsRecord;
import fr.tse.fi2.hpp.labs.beans.measure.QueryProcessorMeasure;
import fr.tse.fi2.hpp.labs.queries.AbstractQueryProcessor;

public class SumQuery extends AbstractQueryProcessor {
<<<<<<< HEAD
	
	private float sum = 0 ;
	public SumQuery(QueryProcessorMeasure measure) {
		super(measure);
		// TODO Auto-generated constructor stub
=======

	private float sum = 0; 
	
	public SumQuery(QueryProcessorMeasure measure) {
		super(measure);
>>>>>>> 0de2c63eb25a5f465922e323b94ac7da00994b06
	}

	@Override
	protected void process(DebsRecord record) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		sum+=record.getFare_amount();
		writeLine("Somme : " + sum);
		

=======
		sum += record.getFare_amount();
		writeLine("Somme " + sum);
>>>>>>> 0de2c63eb25a5f465922e323b94ac7da00994b06
	}

}
