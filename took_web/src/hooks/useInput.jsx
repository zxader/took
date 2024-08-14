import { useCallback, useState } from 'react';

const useInput = (defaultValue = '') => {
  const [value, setValue] = useState(defaultValue);

  const onChange = useCallback((e) => setValue(e.currentTarget.value), []);

  return { value, onChange, setValue };
};

export default useInput;
