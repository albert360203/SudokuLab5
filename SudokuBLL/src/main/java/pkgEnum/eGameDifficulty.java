package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {

	EASY(100), MEDIUM(500), HARD(1000);

	private int iDifficultyValue;
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	static 
	{
		for(eGameDifficulty eGD : eGameDifficulty.values())
			lookup.put(eGD.getiDifficultyValue(), eGD);
	}
	
	private eGameDifficulty(int iDifficultyValue) {
		this.iDifficultyValue = iDifficultyValue;
	}

	private Integer getiDifficultyValue() {
		return this.iDifficultyValue;
	}

	public eGameDifficulty get(int iValeToCheck) 
	{
		
		eGameDifficulty eGDSelected = null;
		  
		for (eGameDifficulty eGD: eGameDifficulty.values())
		{
			if(iValeToCheck >= eGD.iDifficultyValue) 
			{
				eGDSelected = eGD;
		    }
		}
		  
		return eGDSelected;
		  
	}
	
	

}
